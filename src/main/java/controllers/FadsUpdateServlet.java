package controllers;

import dao.DaoFactory;
import dao.Fads;
import dao.ListFadsDao;
import models.Fad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "FadsUpdateServlet", urlPatterns = "/fads/update")
public class FadsUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long id = Long.parseLong(request.getParameter("id"));
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String img_url = request.getParameter("img_url");
        boolean isPasse = Boolean.valueOf(request.getParameter("isPasse"));

        Fad fad = new Fad(id, title, description, img_url, isPasse);

        Fads fadsDao = null;

        try {
            fadsDao = DaoFactory.getFadsDao();
            fadsDao.save(fad);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/fads");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Fads fadsDao = null;

        try {
            fadsDao = DaoFactory.getFadsDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        long id = Integer.parseInt(request.getParameter("id"));

        Fad fad = null;

        try {
            fad = fadsDao.findById((int) id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("fad", fad);

        request.getRequestDispatcher("/WEB-INF/fad/update.jsp").forward(request, response);

    }

}
