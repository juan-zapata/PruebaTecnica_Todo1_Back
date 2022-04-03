package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.DataId;
import com.example.pruebatecnicatodo1.model.Imagen;
import com.example.pruebatecnicatodo1.repository.DataIdRepository;
import com.example.pruebatecnicatodo1.repository.ImagenRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ImagenServiceTest {

    @Mock
    private ImagenRepository imagenRepository;

    @InjectMocks
    private ImagenService imagenService;

    private CrudRepository<Imagen, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getRepository() {
        when(imagenRepository.findAll()).thenReturn((Iterable<Imagen>) crudRepository);
        assertNotNull(imagenService.getRepository());
    }
}