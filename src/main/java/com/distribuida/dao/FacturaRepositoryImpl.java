package com.distribuida.dao;

import com.libreria.Factura;
import java.util.ArrayList;
import java.util.List;

public class FacturaRepositoryImpl implements FacturaRepository {

    private List<Factura> facturas = new ArrayList<>();

    @Override
    public Factura findById(int id) {
        for (Factura f : facturas) {
            if (f.getIdFactura() == id) {
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Factura> findAll() {
        return facturas;
    }

    @Override
    public void insert(Factura factura) {
        facturas.add(factura);
    }

    @Override
    public void update(Factura factura) {
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getIdFactura() == factura.getIdFactura()) {
                facturas.set(i, factura);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        facturas.removeIf(f -> f.getIdFactura() == id);
    }
}
