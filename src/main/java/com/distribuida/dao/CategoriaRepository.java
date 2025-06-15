package com.distribuida.dao;

import com.libreria.Categoria;
import java.util.List;

public interface CategoriaRepository {
    Categoria findById(int id);
    List<Categoria> findAll();
    void insert(Categoria categoria);
    void update(Categoria categoria);
    void delete(int id);
}
