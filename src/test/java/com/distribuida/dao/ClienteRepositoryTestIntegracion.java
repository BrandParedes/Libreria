package com.distribuida.dao;

import com.libreria.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteRepositoryTestIntegracion {

    private ClienteRepository clienteRepository = new ClienteRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@mail.com");
        clienteRepository.insert(cliente);

        Cliente encontrado = clienteRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals("Juan Perez", encontrado.getNombre());
    }

    @Test
    public void testUpdate() {
        Cliente cliente = new Cliente(2, "Ana Lopez", "ana@mail.com");
        clienteRepository.insert(cliente);

        cliente.setNombre("Ana López Actualizada");
        clienteRepository.update(cliente);

        Cliente actualizado = clienteRepository.findById(2);
        assertEquals("Ana López Actualizada", actualizado.getNombre());
    }

    @Test
    public void testDelete() {
        Cliente cliente = new Cliente(3, "Carlos Ruiz", "carlos@mail.com");
        clienteRepository.insert(cliente);

        clienteRepository.delete(3);

        Cliente eliminado = clienteRepository.findById(3);
        assertNull(eliminado);
    }
}
