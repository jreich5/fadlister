package dao;


import java.sql.SQLException;

public class DaoFactory {

    private static Fads fadsDao;
    private static dao.Config config = new dao.Config();

    public static Fads getFadsDao() throws SQLException {
        if (fadsDao == null) {
            fadsDao = new MySQLFadsDao(config);
        }
        return fadsDao;
    }

}
