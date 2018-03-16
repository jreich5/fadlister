package dao;

public class Config {

    private String url = "jdbc:mysql://localhost/fad_db?useSSL=false";
    private String user = "fad_user";
    private String password = "getmein";

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
