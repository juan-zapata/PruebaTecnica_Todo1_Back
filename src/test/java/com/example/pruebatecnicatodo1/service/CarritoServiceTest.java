package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.Articulo;
import com.example.pruebatecnicatodo1.model.Carrito;
import com.example.pruebatecnicatodo1.repository.CarritoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CarritoServiceTest {

    @Mock
    private CarritoRepository carritoRepository;

    @InjectMocks
    private  CarritoService carritoService;

    private CrudRepository<Carrito, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getRepository() {
        when(carritoRepository.findAll()).thenReturn((Iterable<Carrito>) crudRepository);
        assertNotNull(carritoService.getRepository());
    }
}