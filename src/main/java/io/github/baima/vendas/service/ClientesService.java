package io.github.baima.vendas.service;


import io.github.baima.vendas.model.Cliente;
import io.github.baima.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
