package com.distribuida.dao;

import com.libreria.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public Cliente findById(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        return clientes;
    }

    @Override
    public void insert(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == cliente.getIdCliente()) {
                clientes.set(i, cliente);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        clientes.removeIf(cliente -> cliente.getIdCliente() == id);
    }
}
