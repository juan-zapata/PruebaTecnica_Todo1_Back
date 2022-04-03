package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.TieneImagen;
import com.example.pruebatecnicatodo1.repository.TieneImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TieneImagenService extends GeneralServiceImpl<TieneImagen, Long> {
    @Autowired
    TieneImagenRepository tieneImagenRepository;

    @Override
    public CrudRepository<TieneImagen, Long> getRepository() {
        return tieneImagenRepository;
    }
}
