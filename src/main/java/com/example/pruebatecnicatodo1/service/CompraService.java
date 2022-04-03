package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.Compra;
import com.example.pruebatecnicatodo1.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CompraService extends GeneralServiceImpl<Compra, String> {

    @Autowired
    CompraRepository compraRepository;

    @Override
    public CrudRepository<Compra, String> getRepository() {
        return compraRepository;
    }
}
