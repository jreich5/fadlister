package models;

import services.DateService;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fad implements Serializable {

    private long id;
    private String title;
    private String description;
    private String img_url;
    private boolean passe;
    private User user;
    private String created_at;
    private String updated_at;
    private DateService ds = new DateService();

    public Fad() {
    }

    // fad insert
    public Fad(String title, String description, String img_url, boolean passe, User user) {
        this.title = title;
        this.description = description;
        this.img_url = img_url;
        this.passe = passe;
        this.user = user;
    }

    // fad get
    public Fad(long id, String title, String description, String img_url, boolean passe, User user, String created_at, String updated_at) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.img_url = img_url;
        this.passe = passe;
        this.user = user;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public boolean isPasse() {
        return passe;
    }

    public void setPasse(boolean passe) {
        passe = passe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreated_at() {
        return ds.parseDate(this.created_at);
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return ds.parseDate(updated_at);
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

}
