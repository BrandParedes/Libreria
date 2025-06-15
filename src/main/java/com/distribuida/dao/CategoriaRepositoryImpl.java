package com.distribuida.dao;

import com.libreria.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositoryImpl implements CategoriaRepository {

    private List<Categoria> categorias = new ArrayList<>();

    @Override
    public Categoria findById(int id) {
        for (Categoria categoria : categorias) {
            if (categoria.getIdCategoria() == id) {
                return categoria;
            }
        }
        return null;
    }

    @Override
    public List<Categoria> findAll() {
        return categorias;
    }

    @Override
    public void insert(Categoria categoria) {
        categorias.add(categoria);
    }

    @Override
    public void update(Categoria categoria) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getIdCategoria() == categoria.getIdCategoria()) {
                categorias.set(i, categoria);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        categorias.removeIf(categoria -> categoria.getIdCategoria() == id);
    }
}
