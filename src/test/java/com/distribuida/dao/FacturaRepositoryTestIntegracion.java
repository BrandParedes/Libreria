package com.distribuida.dao;

import com.libreria.Factura;
import com.libreria.Cliente;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaRepositoryTestIntegracion {

    private FacturaRepository facturaRepository = new FacturaRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@mail.com");
        Factura factura = new Factura(1, cliente, new Date());
        facturaRepository.insert(factura);

        Factura encontrado = facturaRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals(1, encontrado.getIdFactura());
        assertEquals("Juan Perez", encontrado.getCliente().getNombre());
    }

    @Test
    public void testUpdate() {
        Cliente cliente = new Cliente(2, "Ana Lopez", "ana@mail.com");
        Factura factura = new Factura(2, cliente, new Date());
        facturaRepository.insert(factura);

        Cliente nuevoCliente = new Cliente(3, "Carlos Ruiz", "carlos@mail.com");
        factura.setCliente(nuevoCliente);
        facturaRepository.update(factura);

        Factura actualizado = facturaRepository.findById(2);
        assertEquals("Carlos Ruiz", actualizado.getCliente().getNombre());
    }

    @Test
    public void testDelete() {
        Cliente cliente = new Cliente(4, "Luis Fernandez", "luis@mail.com");
        Factura factura = new Factura(4, cliente, new Date());
        facturaRepository.insert(factura);

        facturaRepository.delete(4);

        Factura eliminado = facturaRepository.findById(4);
        assertNull(eliminado);
    }
}
