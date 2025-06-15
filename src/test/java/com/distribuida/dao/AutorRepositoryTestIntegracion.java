package com.distribuida.dao;

import com.libreria.Autor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorRepositoryTestIntegracion {

    private AutorRepository autorRepository = new AutorRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Autor autor = new Autor(1, "Gabriel García Márquez");
        autorRepository.insert(autor);

        Autor encontrado = autorRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals("Gabriel García Márquez", encontrado.getNombre());
    }

    @Test
    public void testUpdate() {
        Autor autor = new Autor(2, "Isabel Allende");
        autorRepository.insert(autor);

        autor.setNombre("Isabel Allende Actualizada");
        autorRepository.update(autor);

        Autor actualizado = autorRepository.findById(2);
        assertEquals("Isabel Allende Actualizada", actualizado.getNombre());
    }

    @Test
    public void testDelete() {
        Autor autor = new Autor(3, "Mario Vargas Llosa");
        autorRepository.insert(autor);

        autorRepository.delete(3);

        Autor eliminado = autorRepository.findById(3);
        assertNull(eliminado);
    }
}
