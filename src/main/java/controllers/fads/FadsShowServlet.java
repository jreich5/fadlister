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

        Fads fadsDao = DaoFactory.getFadsDao();
        long id = Long.parseLong(request.getParameter("id"));
        Fad fad = fadsDao.findById((int) id);

        System.out.println(fad.getTitle());
        request.setAttribute("fad", fad);
        request.getRequestDispatcher("/WEB-INF/fad/show.jsp").forward(request, response);

    }
}
