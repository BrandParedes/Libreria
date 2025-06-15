package com.distribuida.dao;

import com.libreria.FacturaDetalle;
import java.util.List;

public interface FacturaDetalleRepository {
    FacturaDetalle findById(int id);
    List<FacturaDetalle> findAll();
    void insert(FacturaDetalle detalle);
    void update(FacturaDetalle detalle);
    void delete(int id);
}
