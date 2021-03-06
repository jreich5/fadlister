package controllers.fads;

import dao.DaoFactory;
import dao.fads.Fads;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "FadsDeleteServlet", urlPatterns = "/fads/delete")
public class FadsDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        long id = Long.parseLong(request.getParameter("id"));

        Fads fadsDao = DaoFactory.getFadsDao();
        fadsDao.delete(id);

        response.sendRedirect("/fads");

    }
}
