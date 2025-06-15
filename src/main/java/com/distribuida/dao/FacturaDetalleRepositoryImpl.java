package com.distribuida.dao;

import com.libreria.FacturaDetalle;
import java.util.ArrayList;
import java.util.List;

public class FacturaDetalleRepositoryImpl implements FacturaDetalleRepository {

    private List<FacturaDetalle> detalles = new ArrayList<>();

    @Override
    public FacturaDetalle findById(int id) {
        for (FacturaDetalle detalle : detalles) {
            if (detalle.getIdDetalle() == id) {
                return detalle;
            }
        }
        return null;
    }

    @Override
    public List<FacturaDetalle> findAll() {
        return detalles;
    }

    @Override
    public void insert(FacturaDetalle detalle) {
        detalles.add(detalle);
    }

    @Override
    public void update(FacturaDetalle detalle) {
        for (int i = 0; i < detalles.size(); i++) {
            if (detalles.get(i).getIdDetalle() == detalle.getIdDetalle()) {
                detalles.set(i, detalle);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        detalles.removeIf(detalle -> detalle.getIdDetalle() == id);
    }
}
