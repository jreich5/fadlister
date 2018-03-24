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
import java.sql.SQLException;

@WebServlet(name = "FadsShowServlet", urlPatterns = "/fads/show")
public class FadsShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        Fads fadsDao = DaoFactory.getFadsDao();

        HttpSession session = request.getSession();

        boolean currentUserFad;

        long id = Long.parseLong(request.getParameter("id"));

        if (auth.verifyUser()) {
            User user = (User) session.getAttribute("user");
            currentUserFad = user.getId() == id;
        } else {
            currentUserFad = false;
        }

        Fad fad = fadsDao.findById((int) id);

        System.out.println(fad.getTitle());
        request.setAttribute("fad", fad);
        request.setAttribute("currentUserFad", currentUserFad);
        request.getRequestDispatcher("/WEB-INF/fad/show.jsp").forward(request, response);

    }
}
