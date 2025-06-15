package com.distribuida.service;

import com.distribuida.dao.ClienteRepository;
import com.distribuida.dao.ClienteRepositoryImpl;

public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepositoryImpl();

    @Override
    public void agregarCliente(String nombre) {
        clienteRepository.guardarCliente(nombre);
    }
}
