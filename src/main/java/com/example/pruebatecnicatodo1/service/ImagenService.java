package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.Imagen;
import com.example.pruebatecnicatodo1.repository.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenService extends GeneralServiceImpl<Imagen, Long> {
    @Autowired
    ImagenRepository imagenRepository;

    @Override
    public CrudRepository<Imagen, Long> getRepository() {
        return imagenRepository;
    }
}
