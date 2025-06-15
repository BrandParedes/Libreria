package com.distribuida;

import com.libreria.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {

    @Test
    public void testCrearCategoria() {
        Categoria categoria = new Categoria(5, "Filosofía");

        assertEquals(5, categoria.getIdCategoria());
        assertEquals("Filosofía", categoria.getNombre());
    }
}
