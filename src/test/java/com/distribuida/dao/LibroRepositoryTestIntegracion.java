package com.distribuida.dao;

import com.libreria.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroRepositoryTestIntegracion {

    private LibroRepository libroRepository = new LibroRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Libro libro = new Libro(1, "Cien Años de Soledad");
        libroRepository.insert(libro);

        Libro encontrado = libroRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals("Cien Años de Soledad", encontrado.getTitulo());
    }

    @Test
    public void testUpdate() {
        Libro libro = new Libro(2, "El Amor en los Tiempos del Cólera");
        libroRepository.insert(libro);

        libro.setTitulo("El Amor en los Tiempos del Cólera Actualizado");
        libroRepository.update(libro);

        Libro actualizado = libroRepository.findById(2);
        assertEquals("El Amor en los Tiempos del Cólera Actualizado", actualizado.getTitulo());
    }

    @Test
    public void testDelete() {
        Libro libro = new Libro(3, "La Ciudad y los Perros");
        libroRepository.insert(libro);

        libroRepository.delete(3);

        Libro eliminado = libroRepository.findById(3);
        assertNull(eliminado);
    }
}
