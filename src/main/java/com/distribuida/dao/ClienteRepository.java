package com.distribuida.dao;

import com.libreria.Cliente;
import java.util.List;

public interface ClienteRepository {
    Cliente findById(int id);
    List<Cliente> findAll();
    void insert(Cliente cliente);
    void update(Cliente cliente);
    void delete(int id);
}
