package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.Carrito;
import com.example.pruebatecnicatodo1.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CarritoService extends GeneralServiceImpl<Carrito, Long> {

    @Autowired
    CarritoRepository carritoRepository;

    @Override
    public CrudRepository<Carrito, Long> getRepository() {
        return carritoRepository;
    }
}
