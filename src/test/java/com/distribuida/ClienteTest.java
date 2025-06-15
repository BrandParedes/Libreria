package com.distribuida;

import com.libreria.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testCrearCliente() {
        Cliente cliente = new Cliente(101, "Brandon Paredes", "Sydney, Australia", "brandon@example.com");

        assertEquals(101, cliente.getIdCliente());
        assertEquals("Brandon Paredes", cliente.getNombre());
        assertEquals("Sydney, Australia", cliente.getDireccion());
        assertEquals("brandon@example.com", cliente.getEmail());
    }
}
