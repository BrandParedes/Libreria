package com.distribuida.dao;

import com.libreria.Autor;
import java.util.ArrayList;
import java.util.List;

public class AutorRepositoryImpl implements AutorRepository {

    private List<Autor> autores = new ArrayList<>();

    @Override
    public Autor findById(int id) {
        for (Autor a : autores) {
            if (a.getIdAutor() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Autor> findAll() {
        return autores;
    }

    @Override
    public void insert(Autor autor) {
        autores.add(autor);
    }

    @Override
    public void update(Autor autor) {
        for (int i = 0; i < autores.size(); i++) {
            if (autores.get(i).getIdAutor() == autor.getIdAutor()) {
                autores.set(i, autor);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        autores.removeIf(a -> a.getIdAutor() == id);
    }
}
