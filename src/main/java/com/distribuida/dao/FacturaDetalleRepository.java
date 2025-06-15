package com.distribuida.dao;

import com.libreria.FacturaDetalle; // Ajusta este paquete si es diferente
import java.util.ArrayList;
import java.util.List;

public class FacturaDetalleRepository {
    private List<FacturaDetalle> detalles = new ArrayList<>();

    public void guardarDetalle(FacturaDetalle detalle) {
        detalles.add(detalle);
    }

    public List<FacturaDetalle> obtenerDetalles() {
        return detalles;
    }

    public FacturaDetalle buscarPorId(int id) {
        for (FacturaDetalle d : detalles) {
            if (d.getIdDetalle() == id) {
                return d;
            }
        }
        return null;
    }

    public void eliminarPorId(int id) {
        detalles.removeIf(d -> d.getIdDetalle() == id);
    }

    public void actualizarDetalle(FacturaDetalle detalle) {
        for (int i = 0; i < detalles.size(); i++) {
            if (detalles.get(i).getIdDetalle() == detalle.getIdDetalle()) {
                detalles.set(i, detalle);
                return;
            }
        }
    }
}
