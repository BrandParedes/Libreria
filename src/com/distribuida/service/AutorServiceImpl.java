package com.distribuida.service;

import com.distribuida.dao.AutorRepository;

public class AutorServiceImpl implements AutorService {
    private AutorRepository autorRepository = new AutorRepository();

    @Override
    public void agregarAutor(String nombre) {
        autorRepository.guardarAutor(nombre);
    }
}
