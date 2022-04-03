package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.Articulo;
import com.example.pruebatecnicatodo1.repository.ArticuloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class ArticuloServiceTest {

    @Mock
    private ArticuloRepository articuloRepository;

    @InjectMocks
    private ArticuloService articuloService;

    private Articulo articulo;

    private CrudRepository<Articulo, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    void getRepository() {
        when(articuloRepository.findAll()).thenReturn((Iterable<Articulo>) crudRepository);
        assertNotNull(articuloService.getRepository());
    }
}