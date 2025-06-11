package com.distribuida.service;

import com.distribuida.dao.CategoriaRepository;

public class CategoriaServiceImpl implements CategoriaService {
    private CategoriaRepository categoriaRepository = new CategoriaRepository();

    @Override
    public void agregarCategoria(String nombre) {
        categoriaRepository.guardarCategoria(nombre);
    }
}
