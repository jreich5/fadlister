package dao.users;

import models.User;

import java.util.List;

public interface Users {

    List<User> all();
    User findUserByName();
    User findUserByEmail();
    User findById(long id);
    boolean delete();
    void save();
    long verifyEmailPass(String email, String pass);

}
