package com.distribuida.dao;

import com.libreria.FacturaDetalle;
import com.libreria.Libro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaDetalleRepositoryTestIntegracion {

    private FacturaDetalleRepository facturaDetalleRepository = new FacturaDetalleRepositoryImpl();

    @Test
    public void testInsertAndFindById() {
        Libro libro = new Libro(1, "El Túnel");
        FacturaDetalle detalle = new FacturaDetalle(1, libro, 2, 200.0);
        facturaDetalleRepository.insert(detalle);

        FacturaDetalle encontrado = facturaDetalleRepository.findById(1);
        assertNotNull(encontrado);
        assertEquals(2, encontrado.getCantidad());
        assertEquals("El Túnel", encontrado.getLibro().getTitulo());
    }

    @Test
    public void testUpdate() {
        Libro libro = new Libro(2, "Rayuela");
        FacturaDetalle detalle = new FacturaDetalle(2, libro, 1, 150.0);
        facturaDetalleRepository.insert(detalle);

        detalle.setCantidad(3);
        facturaDetalleRepository.update(detalle);

        FacturaDetalle actualizado = facturaDetalleRepository.findById(2);
        assertEquals(3, actualizado.getCantidad());
    }

    @Test
    public void testDelete() {
        Libro libro = new Libro(3, "Los Detectives Salvajes");
        FacturaDetalle detalle = new FacturaDetalle(3, libro, 1, 100.0);
        facturaDetalleRepository.insert(detalle);

        facturaDetalleRepository.delete(3);

        FacturaDetalle eliminado = facturaDetalleRepository.findById(3);
        assertNull(eliminado);
    }
}
