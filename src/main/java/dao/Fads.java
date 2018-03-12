package dao;

import models.Fad;

import java.sql.SQLException;
import java.util.List;

public interface Fads {

    List<Fad> all() throws SQLException;
    Fad findById(long id);
    void delete(long id);
    void save(Fad fad);

}
