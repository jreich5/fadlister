package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FadsShowServlet", urlPatterns = "/fads/show")
public class FadsShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // String name = request.getParameter("name");
        // request.setAttribute("name", name);
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }
}
