package com.distribuida.dao;

import com.libreria.Autor;
import java.util.ArrayList;
import java.util.List;

public class AutorRepository {
    private List<Autor> autores = new ArrayList<>();

    public void guardarAutor(String nombre) {
        Autor autor = new Autor(autores.size() + 1, nombre, "Desconocida");
        autores.add(autor);
    }

    public List<Autor> obtenerAutores() {
        return autores;
    }
}
