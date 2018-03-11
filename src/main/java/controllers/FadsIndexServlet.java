package controllers;

import dao.Fads;
import dao.ListFadsDao;
import models.Fad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(name = "FadsIndexServlet", urlPatterns = "/fads")
public class FadsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Fad.fadCount = 1;

        Fads fadsDao = new ListFadsDao();

        HttpSession session = request.getSession();
        session.setAttribute("username", "John");

        request.setAttribute("fads", fadsDao.all());
        request.getRequestDispatcher("/WEB-INF/fad/index.jsp").forward(request, response);
    }
}