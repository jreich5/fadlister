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
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UsersIndexServlet", urlPatterns = "/users")
public class UsersIndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Users usersDao;

        usersDao = DaoFactory.getUsersDao();

        List<User> users = usersDao.all();

        request.setAttribute("users", users);

        request.getRequestDispatcher("/WEB-INF/user/index.jsp").forward(request, response);

    }
}
