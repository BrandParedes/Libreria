package com.libreria;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int idFactura;
    private Cliente cliente;          // Inyección de dependencia
    private Date fecha;
    private List<FacturaDetalle> detalles;

    public Factura() {
        detalles = new ArrayList<>();
    }

    public Factura(int idFactura, Cliente cliente, Date fecha) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.fecha = fecha;
        this.detalles = new ArrayList<>();
    }

    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public List<FacturaDetalle> getDetalles() { return detalles; }
    public void setDetalles(List<FacturaDetalle> detalles) { this.detalles = detalles; }

    // Método para agregar detalle a la factura
    public void agregarDetalle(FacturaDetalle detalle) {
        this.detalles.add(detalle);
    }

    // Método para calcular total
    public double calcularTotal() {
        double total = 0;
        for (FacturaDetalle det : detalles) {
            total += det.getSubtotal();
        }
        return total;
    }
}
