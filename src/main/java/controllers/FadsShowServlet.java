package controllers;

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
import java.util.ArrayList;

@WebServlet(name = "FadsShowServlet", urlPatterns = "/fads/show")
public class FadsShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Fad.fadCount = 1;

        Fads fadsDao = new ListFadsDao();

        long id = Integer.parseInt(request.getParameter("id"));

        Fad fad = fadsDao.findById((int) id);

        request.setAttribute("fad", fad);

        request.getRequestDispatcher("/WEB-INF/fad/show.jsp").forward(request, response);
    }
}
