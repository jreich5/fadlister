package controllers.fads;

import dao.DaoFactory;
import dao.fads.Fads;
import models.Fad;
import models.User;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "FadsShowServlet", urlPatterns = "/fads/show")
public class FadsShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long fadID = Long.parseLong(request.getParameter("id"));
        Fads fadsDao = DaoFactory.getFadsDao();
        Auth auth = new Auth(request);
        Fad fad = fadsDao.findById((int) fadID);

        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        request.setAttribute("fad", fad);
        request.setAttribute("currentUserFad", auth.verifyFadUser(fad));
        request.getRequestDispatcher("/WEB-INF/fad/show.jsp").forward(request, response);

    }
}
