package services;

import com.sun.deploy.net.HttpRequest;
import models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

public class Auth {

    private HttpServletRequest request;
    private final String[] preAuthorizedUrls = {
            "/",
            "/fads",
            "/login",
            "/register",
            "/fads/show"
    };

    public Auth(HttpServletRequest request) {
        this.request = request;
    }

    public boolean shouldRedirect() {
        // if user is attempting to access a non-pre-authorized path, return false
        if (!Arrays.asList(preAuthorizedUrls).contains(request.getServletPath())) {
            if (!verifyUser()) {
                return false;
            }
        }
        return true;
    }

    public boolean verifyUser() {
        HttpSession session = request.getSession();
        return session.getAttribute("user") != null;
    }

    public long getAuthUserId() {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return user.getId();
    }

}
