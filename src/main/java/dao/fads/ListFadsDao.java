package dao.fads;

import models.Fad;

import java.util.ArrayList;
import java.util.List;

public class ListFadsDao implements Fads {

    List<Fad> fads;

    public ListFadsDao() {
        this.fads = new ArrayList<>();
        createFads();
    }

    @Override
    public List<Fad> all() {
        return fads;
    }

    @Override
    public List<Fad> getFadsByUser(long user_id) {
        return null;
    }

    @Override
    public Fad findById(long id) {
        return fads.get((int) id - 1);
    }

    @Override
    public boolean delete(long id) {
        fads.remove(id);
        return true;
    }

    @Override
    public void save(Fad fad) {

        if (fad.getId() == 0) {
            fad.setId(fads.size());
            fads.add(fad);
        } else {
            fads.set((int) fad.getId() - 1, fad);
        }

    }

    void createFads() {
//        fads.add(new Fad("A Fad Title 1", "This is a fad description 1.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
//        fads.add(new Fad("A Fad Title 2", "This is a fad description 2.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
//        fads.add(new Fad("A Fad Title 3", "This is a fad description 3.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
//        fads.add(new Fad("A Fad Title 4", "This is a fad description 4.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
//        fads.add(new Fad("A Fad Title 5", "This is a fad description 5.", "http://via.placeholder.com/300x300", true, "2001-01-01", "2001-01-01"));
    }
}
