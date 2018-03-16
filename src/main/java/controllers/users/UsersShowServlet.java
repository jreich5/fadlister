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
import java.sql.SQLException;

@WebServlet(name = "UsersShowServlet", urlPatterns = "/users/show")
public class UsersShowServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Users usersDao;
        try {
            usersDao = DaoFactory.getUsersDao();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error showing individual user servlet");
        }

        User user = usersDao.findById(Long.parseLong(request.getParameter("id")));

        request.setAttribute("user", user);

        request.getRequestDispatcher("/WEB-INF/user/show.jsp").forward(request, response);

    }
}
