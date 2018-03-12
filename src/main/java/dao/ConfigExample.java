package dao;

public class ConfigExample {

    private String url = "jdbc:mysql://localhost/SOME_DB?useSSL=false";
    private String user = "SOME_DB_USER";
    private String password = "SOME_DB_PASSWORD";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
