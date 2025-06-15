package com.distribuida.dao;

import com.libreria.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public Libro findById(int id) {
        for (Libro l : libros) {
            if (l.getIdLibro() == id) {
                return l;
            }
        }
        return null;
    }

    @Override
    public List<Libro> findAll() {
        return libros;
    }

    @Override
    public void insert(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void update(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIdLibro() == libro.getIdLibro()) {
                libros.set(i, libro);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        libros.removeIf(l -> l.getIdLibro() == id);
    }
}
