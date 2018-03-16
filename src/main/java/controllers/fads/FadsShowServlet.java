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

@WebServlet(name = "FadsShowServlet", urlPatterns = "/fads/show")
public class FadsShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Fads fadsDao = null;
        try {
            fadsDao = DaoFactory.getFadsDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        long id = Long.parseLong(request.getParameter("id"));

        Fad fad = null;

        fad = fadsDao.findById((int) id);


        request.setAttribute("fad", fad);

        request.getRequestDispatcher("/show.jsp").forward(request, response);

    }
}
