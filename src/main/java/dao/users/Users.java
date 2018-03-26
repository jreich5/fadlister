package dao.users;

import models.User;

import java.util.List;

public interface Users {

    List<User> all();
    User find(String column, String value);
    boolean delete(long id);
    void save(User user);
    long verifyEmailPass(String email, String pass);


}
