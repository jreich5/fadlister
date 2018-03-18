package dao.users;

import com.mysql.cj.jdbc.Driver;
import dao.Config;
import models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {

    private Connection conn;

    public MySQLUsersDao(Config config) {

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

    @Override
    public List<User> all() {
        String query = "SELECT * FROM users";

        try {
            Statement stmt = conn.createStatement();
            ResultSet usersRs = stmt.executeQuery(query);
            List<User> users = new ArrayList<>();

            while(usersRs.next()) {

                long id = usersRs.getLong("id");
                String name = usersRs.getString("name");
                String email = usersRs.getString("email");
                String password = usersRs.getString("password");
                String created_at = usersRs.getString("created_at");
                String updated_at = usersRs.getString("updated_at");

                User user = new User(id, name, email, password, created_at, updated_at);

                users.add(user);

            }

            return users;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error getting all users");
        }



    }

    @Override
    public User findUserByName() {
        return null;
    }

    @Override
    public User findUserByEmail() {
        return null;
    }

    @Override
    public User findById(long id) {
        String query = "SELECT * FROM users WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            rs.next();

            long user_id = rs.getLong("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String created_at = rs.getString("created_at");
            String updated_at = rs.getString("updated_at");

            User user = new User(user_id, name, email, password, created_at, updated_at);

            return user;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error finding user by ID");
        }

    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public void save(User user) {
        if (user.getId() == 0) {
            insert(user);
        } else {
            update(user);
        }
    }

    public long insert(User user) {

        String query = "INSERT INTO users (name, email, password, created_at, updated_at) VALUES (?, ?, ?, NOW(), NOW())";

        try {
            PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, hashPassword(user.getPassword()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error inserting new user");
        }

    }

    public void update(User user) {

    }

    public String hashPassword(String password) {
        int numberOfRounds = 12;
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(numberOfRounds));
        return hash;
    }


    @Override
    public long verifyEmailPass(String email, String pass) {
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getLong("id");
            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error creating verifying email and pass");
        }

    }
}
