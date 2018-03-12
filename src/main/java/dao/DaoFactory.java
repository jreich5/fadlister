package dao;


import java.sql.SQLException;

public class DaoFactory {

    private static Fads fadsDao;
    private static Config config = new Config();

    public static Fads getFadsDao() throws SQLException {
        if (fadsDao == null) {
            fadsDao = new MySQLFadsDao(config);
        }
        return fadsDao;
    }

}
