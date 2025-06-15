package com.distribuida.dao;

import com.libreria.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaRepositoryTestIntegracion {

    private CategoriaRepository categoriaRepository = new CategoriaRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Categoria categoria = new Categoria(1, "Ficción");
        categoriaRepository.insert(categoria);

        Categoria encontrado = categoriaRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals("Ficción", encontrado.getNombre());
    }

    @Test
    public void testUpdate() {
        Categoria categoria = new Categoria(2, "No Ficción");
        categoriaRepository.insert(categoria);

        categoria.setNombre("No Ficción Actualizada");
        categoriaRepository.update(categoria);

        Categoria actualizado = categoriaRepository.findById(2);
        assertEquals("No Ficción Actualizada", actualizado.getNombre());
    }

    @Test
    public void testDelete() {
        Categoria categoria = new Categoria(3, "Ciencia");
        categoriaRepository.insert(categoria);

        categoriaRepository.delete(3);

        Categoria eliminado = categoriaRepository.findById(3);
        assertNull(eliminado);
    }
}
