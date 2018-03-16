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
    public Fad findById(long id) throws SQLException {

        String query = "SELECT * FROM fads WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setLong(1, id);

        ResultSet rs = ps.executeQuery();

        rs.next();

        Fad fad = new Fad(rs.getString("title"),
            rs.getString("description"),
            rs.getString("img_url"),
            rs.getBoolean("isPasse"),
            rs.getString("created_at"),
            rs.getString("updated_at")
        );

        fad.setId(rs.getLong("id"));

        return fad;

    }

    @Override
    public boolean delete(long id) {

        String query = "DELETE FROM fads WHERE id = ?";

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);

            ps.setLong(1, id);
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating fad");
        }

    }

    @Override
    public void save(Fad fad) {


        if (fad.getId() == 0) {
            insert(fad);
        } else {
            update(fad);
        }

    }

    private boolean update(Fad fad) {

        String query = "UPDATE fads SET title = ?, description = ?, img_url = ?, isPasse = ?, updated_at = NOW() WHERE id = ?";

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);

            ps.setString(1, fad.getTitle());
            ps.setString(2, fad.getDescription());
            ps.setString(3, fad.getImg_url());
            ps.setBoolean(4, fad.getIsPasse());
            ps.setLong(5, fad.getId());

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating fad");
        }

    }

    private long insert(Fad fad) {

        String query = "INSERT INTO fads (title, description, img_url, isPasse, created_at, updated_at) VALUES (?, ?, ?, ?, NOW(), NOW())";

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, fad.getTitle());
            ps.setString(2, fad.getDescription());
            ps.setString(3, fad.getImg_url());
            ps.setBoolean(4, fad.getIsPasse());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error inserting Fad");
        }

    }
}
