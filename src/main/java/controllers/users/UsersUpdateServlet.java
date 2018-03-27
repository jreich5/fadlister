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

@WebServlet(name = "UsersUpdateServlet", urlPatterns = "/users/update")
public class UsersUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users usersRepo = DaoFactory.getUsersDao();
        User userToEdit = usersRepo.find("id", request.getParameter("id"));

        userToEdit.setPassword(request.getParameter("password"));
        userToEdit.setEmail(request.getParameter("email"));
        userToEdit.setName(request.getParameter("name"));

        usersRepo.save(userToEdit);

        response.sendRedirect("/users/profile");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/user/update.jsp").forward(request, response);
    }
}
