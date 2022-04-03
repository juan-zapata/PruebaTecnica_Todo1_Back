package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.Articulo;
import com.example.pruebatecnicatodo1.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService extends GeneralServiceImpl<Articulo, Long> {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public CrudRepository<Articulo, Long> getRepository() {
        return articuloRepository;
    }
}
