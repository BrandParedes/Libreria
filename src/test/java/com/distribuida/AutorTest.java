package com.distribuida;

import com.libreria.Autor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCrearAutor() {
        Autor autor = new Autor(1, "Gabriel García Márquez", "Colombiana");

        assertEquals(1, autor.getIdAutor());
        assertEquals("Gabriel García Márquez", autor.getNombre());
        assertEquals("Colombiana", autor.getNacionalidad());
    }
}
