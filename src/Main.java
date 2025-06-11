package com.libreria;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "Gabriel García Márquez", "Colombiano");
        Categoria categoria = new Categoria(1, "Novela");
        Libro libro = new Libro(1, "Cien años de soledad", autor, categoria, 25.50);

        Cliente cliente = new Cliente(1, "Juan Perez", "Av Siempre Viva 123", "juan@example.com");
        Factura factura = new Factura(1, cliente, new Date());

        FacturaDetalle detalle = new FacturaDetalle(1, libro, 2, libro.getPrecio() * 2);
        factura.agregarDetalle(detalle);

        System.out.println("Cliente: " + factura.getCliente().getNombre());
        System.out.println("Libro: " + detalle.getLibro().getTitulo());
        System.out.println("Total factura: $" + factura.calcularTotal());
    }
}
