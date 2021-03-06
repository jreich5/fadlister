package controllers.fads;

import dao.DaoFactory;
import dao.fads.Fads;
import models.Fad;
import models.User;
import services.Auth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "FadsUpdateServlet", urlPatterns = "/fads/update")
public class FadsUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        long id = Long.parseLong(request.getParameter("id"));
//        String title = request.getParameter("title");
//        String description = request.getParameter("description");
//        String img_url = request.getParameter("img_url");
//        boolean isPasse = Boolean.valueOf(request.getParameter("isPasse"));
//
//        Fad fad = new Fad(id, title, description, img_url, isPasse);
//
//        Fads fadsDao = null;
//
//        fadsDao = DaoFactory.getFadsDao();
//        fadsDao.save(fad);
//
//        response.sendRedirect("/fads");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Auth auth = new Auth(request);
        if (!auth.shouldRedirect()) {
            response.sendRedirect("/login");
            return;
        }

        Fads fadsDao = null;

        fadsDao = DaoFactory.getFadsDao();

        long id = Integer.parseInt(request.getParameter("id"));

        Fad fad = null;

        fad = fadsDao.findById((int) id);

        HttpSession session = request.getSession();

        User fadUser = fad.getUser();

        if (fadUser == session.getAttribute("user")) {

        }

        request.setAttribute("fad", fad);

        request.getRequestDispatcher("/WEB-INF/fad/update.jsp").forward(request, response);



    }

}
