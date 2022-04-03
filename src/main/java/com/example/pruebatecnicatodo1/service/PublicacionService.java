package com.example.pruebatecnicatodo1.service;



import com.example.pruebatecnicatodo1.model.Publicacion;
import com.example.pruebatecnicatodo1.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PublicacionService extends GeneralServiceImpl<Publicacion, Long> {

    @Autowired
    PublicacionRepository publicacionRepository;

    public CrudRepository<Publicacion, Long> getRepository() {
        return publicacionRepository;
    }
}
