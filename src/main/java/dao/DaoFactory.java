package dao;


import dao.fads.Fads;
import dao.fads.MySQLFadsDao;
import dao.users.MySQLUsersDao;
import dao.users.Users;

import java.sql.SQLException;

public class DaoFactory {

    private static Fads fadsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Fads getFadsDao() {
        if (fadsDao == null) {
            fadsDao = new MySQLFadsDao(config);
        }
        return fadsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

}
