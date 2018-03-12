package dao;

import com.mysql.cj.jdbc.Driver;
import models.Fad;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class MySQLFadsDao implements Fads{

    private Connection conn;

    public MySQLFadsDao(Config config) throws SQLException {

        DriverManager.registerDriver(new Driver());
        this.conn = DriverManager.getConnection(
            config.getUrl(),
            config.getUser(),
            config.getPassword()
        );

    }

    @Override
    public List<Fad> all() throws SQLException {
        String query = "SELECT * FROM fads";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        List<Fad> fads = new ArrayList<>();

        while (rs.next()) {
            Fad fad = new Fad();
            fad.setId(rs.getLong("id"));
            fad.setTitle(rs.getString("title"));
            fad.setDescription(rs.getString("description"));
            fad.setImg_url(rs.getString("img_url"));
            fad.setIsPasse(rs.getBoolean("isPasse"));
            fad.setCreated_at(rs.getString("created_at"));
            fad.setUpdated_at(rs.getString("updated_at"));
            fads.add(fad);
        }

        return fads;

    }

    @Override
    public Fad findById(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void save(Fad fad) {

    }
}
