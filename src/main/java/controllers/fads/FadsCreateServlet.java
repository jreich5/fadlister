package controllers.fads;

import dao.DaoFactory;
import dao.fads.Fads;
import models.Fad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "FadsCreateServlet", urlPatterns = "/fads/create")
public class FadsCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String img_url = request.getParameter("img_url");
        boolean isPasse = Boolean.getBoolean(request.getParameter("isPasse"));

        Fad fad = new Fad(title, description, img_url, isPasse);

        try {
            Fads fadsDao = DaoFactory.getFadsDao();
            fadsDao.save(fad);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/fads");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/fad/create.jsp").forward(request, response);
    }
}
