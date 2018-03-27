package dao.fads;

import com.mysql.cj.jdbc.Driver;
import dao.Config;
import models.Fad;
import models.User;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class MySQLFadsDao implements Fads {

    private Connection conn;

    public MySQLFadsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            this.conn = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Problem registering driver");
        }

    }

    public List<Fad> getFadsByUser(long user_id) {
        String query = "SELECT f.*, u.*\n" +
                "FROM fads AS f\n" +
                "JOIN users AS u\n" +
                "ON f.user_id = u.id\n" +
                "WHERE user_id = ?";
        List<Fad> fads = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, user_id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                fads.add(buildFadObject(rs));
            }

            return fads;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error with retrieving all fads");
        }
    }

    private Fad buildFadObject(ResultSet rs) throws SQLException {
        Fad fad = new Fad();
        fad.setId(rs.getLong("f.id"));
        fad.setTitle(rs.getString("f.title"));
        fad.setDescription(rs.getString("f.description"));
        fad.setImg_url(rs.getString("f.img_url"));
        fad.setPasse(rs.getBoolean("f.passe"));
        fad.setCreated_at(rs.getString("f.created_at"));
        fad.setUpdated_at(rs.getString("f.updated_at"));
        fad.setUser(
                new User(
                        rs.getLong("u.id"),
                        rs.getString("u.name"),
                        rs.getString("u.email")
                )
        );
        return fad;
    }

    @Override
    public List<Fad> all() {

        String query = "SELECT f.*, u.*\n" +
                "FROM fads AS f\n" +
                "JOIN users AS u\n" +
                "ON f.user_id = u.id";

        List<Fad> fads = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                fads.add(buildFadObject(rs));
            }

            return fads;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error with retrieving all fads");
        }
    }


    @Override
    public Fad findById(long id) {

        String query = "SELECT f.*, u.*\n" +
                "FROM fads AS f\n" +
                "JOIN users AS u\n" +
                "ON f.user_id = u.id\n" +
                "WHERE f.id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            rs.next();

            // CONSIDER REFACTOR into method
            Fad fad = new Fad();
            fad.setId(rs.getLong("f.id"));
            fad.setTitle(rs.getString("f.title"));
            fad.setDescription(rs.getString("f.description"));
            fad.setImg_url(rs.getString("f.img_url"));
            fad.setPasse(rs.getBoolean("f.passe"));
            fad.setCreated_at(rs.getString("f.created_at"));
            fad.setUpdated_at(rs.getString("f.updated_at"));
            fad.setUser(
                    new User(
                            rs.getLong("u.id"),
                            rs.getString("u.name"),
                            rs.getString("u.email")
                    )
            );

            fad.setId(rs.getLong("id"));

            return fad;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding by ID");
        }

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

        String query = "UPDATE fads SET title = ?, description = ?, img_url = ?, passe = ?, updated_at = NOW() WHERE id = ?";

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);

            ps.setString(1, fad.getTitle());
            ps.setString(2, fad.getDescription());
            ps.setString(3, fad.getImg_url());
            ps.setBoolean(4, fad.isPasse());
            ps.setLong(5, fad.getId());

            return ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error updating fad");
        }

    }

    private long insert(Fad fad) {

        String query = "INSERT INTO fads (user_id, title, description, img_url, passe, created_at, updated_at) VALUES (?, ?, ?, ?, ?, NOW(), NOW())";

        try {
            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setLong(1, fad.getUser().getId());
            ps.setString(2, fad.getTitle());
            ps.setString(3, fad.getDescription());
            ps.setString(4, fad.getImg_url());
            ps.setBoolean(5, fad.isPasse());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error inserting Fad");
        }

    }
}
