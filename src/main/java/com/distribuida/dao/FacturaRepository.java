package com.distribuida.dao;

import com.libreria.Factura;
import java.util.List;

public interface FacturaRepository {
    Factura findById(int id);
    List<Factura> findAll();
    void insert(Factura factura);
    void update(Factura factura);
    void delete(int id);
}

