package com.distribuida.service;

import com.distribuida.dao.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepository();

    @Override
    public void agregarCliente(String nombre) {
        clienteRepository.guardarCliente(nombre);
    }
}
