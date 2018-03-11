package controllers;

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

        ArrayList<Fad> fads = new ArrayList<>();

        fads.add(new Fad("A Fad Title 1", "This is a fad description 1.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
        fads.add(new Fad("A Fad Title 2", "This is a fad description 2.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
        fads.add(new Fad("A Fad Title 3", "This is a fad description 3.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
        fads.add(new Fad("A Fad Title 4", "This is a fad description 4.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
        fads.add(new Fad("A Fad Title 5", "This is a fad description 5.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));

        HttpSession session = request.getSession();
        session.setAttribute("username", "John");

        request.setAttribute("fads", fads);
        request.getRequestDispatcher("/WEB-INF/fad/index.jsp").forward(request, response);
    }
}