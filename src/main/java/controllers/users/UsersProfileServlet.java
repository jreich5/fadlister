package controllers.users;

import dao.DaoFactory;
import dao.fads.Fads;
import dao.users.Users;
import models.Fad;
import models.User;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsersProfileServlet", urlPatterns = "/users/profile")
public class UsersProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        Users usersDao = DaoFactory.getUsersDao();
        Fads fadsDao = DaoFactory.getFadsDao();

        long id = auth.getLoggedUser().getId();

        User user = usersDao.find("id", Long.toString(id));

        List<Fad> fads = fadsDao.getFadsByUser(id);

        request.setAttribute("user", user);
        request.setAttribute("fads", fads);

        request.getRequestDispatcher("/WEB-INF/user/profile.jsp").forward(request, response);

    }
}
