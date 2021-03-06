package controllers.fads;

import dao.DaoFactory;
import dao.fads.Fads;
import dao.users.Users;
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
import java.util.List;


@WebServlet(name = "FadsIndexServlet", urlPatterns = "/fads")
public class FadsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fads fadsDao = DaoFactory.getFadsDao();
        List<Fad> fads = fadsDao.all();

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        request.setAttribute("fads", fads);
        request.getRequestDispatcher("/WEB-INF/fad/index.jsp").forward(request, response);

    }
}