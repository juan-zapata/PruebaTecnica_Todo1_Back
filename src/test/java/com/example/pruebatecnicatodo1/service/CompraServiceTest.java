package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.Articulo;
import com.example.pruebatecnicatodo1.model.Carrito;
import com.example.pruebatecnicatodo1.model.Compra;
import com.example.pruebatecnicatodo1.repository.ArticuloRepository;
import com.example.pruebatecnicatodo1.repository.CompraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CompraServiceTest {

    @Mock
        private CompraRepository compraRepository;

    @InjectMocks
    private CompraService compraService;

    private CrudRepository<Compra, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getRepository() {
        when(compraRepository.findAll()).thenReturn((Iterable<Compra>) crudRepository);
        assertNotNull(compraService.getRepository());
    }
}