package services;

import com.sun.deploy.net.HttpRequest;
import models.Fad;
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
    HttpSession session;

    public Auth(HttpServletRequest request) {
        this.request = request;
        this.session = this.request.getSession();
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
        return getLoggedUser() != null;
    }

    public User getLoggedUser(){
        return (User) this.session.getAttribute("user");
    }

    public boolean verifyFadUser(Fad fad) {
        return getLoggedUser().getId() == fad.getUser().getId();
    }

}
