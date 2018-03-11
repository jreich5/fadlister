package dao;

import models.Fad;

import java.util.List;

public interface Fads {

    List<Fad> all();
    Fad findById(long id);
    void delete(long id);
    void save(Fad fad);

}
