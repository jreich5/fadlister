package controllers.users;

import dao.DaoFactory;
import dao.users.Users;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        Users usersDao = DaoFactory.getUsersDao();

        // check if the user email already matches an existing email
        // if the account exists, redirect to login page
        if (usersDao.find("email", email) != null) {
            response.sendRedirect("/login");
        // otherwise, create the user and redirect to their profile page
        } else {
            User user = new User(name, email, password);
            usersDao.save(user);
            response.sendRedirect("/fads");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }
}
