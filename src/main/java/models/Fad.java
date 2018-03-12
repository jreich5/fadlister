package models;

import java.io.Serializable;

public class Fad implements Serializable {

    public static long fadCount = 1;

    private long id;
    private String title;
    private String description;
    private String img_url;
    private boolean isPasse;
    private String created_at;
    private String updated_at;

    public Fad() {}

    public Fad(String title, String description, String img_url, boolean isPasse, String created_at, String updated_at) {
        this.id = Fad.fadCount;
        this.title = title;
        this.description = description;
        this.img_url = img_url;
        this.isPasse = isPasse;
        this.created_at = created_at;
        this.updated_at = updated_at;
        Fad.fadCount += 1;
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

    public boolean getIsPasse() {
        return isPasse;
    }

    public void setIsPasse(boolean passe) {
        isPasse = passe;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
