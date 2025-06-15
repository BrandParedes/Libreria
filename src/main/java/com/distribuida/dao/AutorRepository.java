package com.distribuida.dao;

import com.libreria.Autor;
import java.util.List;

public interface AutorRepository {
    Autor findById(int id);
    List<Autor> findAll();
    void insert(Autor autor);
    void update(Autor autor);
    void delete(int id);
}
