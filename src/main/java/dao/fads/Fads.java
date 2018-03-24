package dao.fads;

import models.Fad;

import java.sql.SQLException;
import java.util.List;

public interface Fads {

    List<Fad> all();
    List<Fad> getFadsByUser(long user_id);
    Fad findById(long id);
    boolean delete(long id);
    void save(Fad fad);

}
