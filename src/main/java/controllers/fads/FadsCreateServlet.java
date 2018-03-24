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

@WebServlet(name = "FadsCreateServlet", urlPatterns = "/fads/create")
public class FadsCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String img_url = request.getParameter("img_url");
        boolean passe = Boolean.getBoolean(request.getParameter("passe"));

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        Fad fad = new Fad(title, description, img_url, passe, user);

        Fads fadsDao = DaoFactory.getFadsDao();
        fadsDao.save(fad);

        response.sendRedirect("/fads");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/fad/create.jsp").forward(request, response);

    }
}
