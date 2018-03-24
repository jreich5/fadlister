package controllers.users;

import dao.DaoFactory;
import dao.users.Users;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Users usersDao;

        usersDao = DaoFactory.getUsersDao();

        long verifiedId = usersDao.verifyEmailPass(email, password);

        System.out.println(verifiedId);

        if (verifiedId == 0) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Invalid Login!</h1>");
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("user", usersDao.find("id", Long.toString(verifiedId)));
            response.sendRedirect("/users/show?id=" + verifiedId);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("login.jsp").forward(request, response);

    }
}
