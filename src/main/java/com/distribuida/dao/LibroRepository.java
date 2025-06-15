package com.distribuida.dao;

import com.libreria.Libro;
import java.util.List;

public interface LibroRepository {
    Libro findById(int id);
    List<Libro> findAll();
    void insert(Libro libro);
    void update(Libro libro);
    void delete(int id);
}
