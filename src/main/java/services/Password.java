package services;

import org.mindrot.jbcrypt.BCrypt;

public class Password {

    public String hashPassword(String password) {
        int numberOfRounds = 12;
        return BCrypt.hashpw(password, BCrypt.gensalt(numberOfRounds));
    }

}
