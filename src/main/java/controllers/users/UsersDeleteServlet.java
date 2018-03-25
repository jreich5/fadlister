package controllers.users;

import dao.DaoFactory;
import dao.users.Users;
import models.User;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UsersDeleteServlet", urlPatterns = "/users/delete")
public class UsersDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        long id = Long.parseLong(request.getParameter("id"));

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        // redirect if user attempts to delete an account other than their own
        if (user.getId() != id) {
            response.sendRedirect("/profile");
            return;
        }

        Users usersDao = (Users) DaoFactory.getUsersDao();

        usersDao.delete(id);

        response.sendRedirect("/logout");

    }

}
