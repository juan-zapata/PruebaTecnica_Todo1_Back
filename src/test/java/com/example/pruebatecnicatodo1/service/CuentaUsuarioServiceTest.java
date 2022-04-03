package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.Compra;
import com.example.pruebatecnicatodo1.model.CuentaUsuario;
import com.example.pruebatecnicatodo1.repository.CompraRepository;
import com.example.pruebatecnicatodo1.repository.CuentaUsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CuentaUsuarioServiceTest {

    @Mock
    private CuentaUsuarioRepository cuentaUsuarioRepository;

    @InjectMocks
    private CuentaUsuarioService cuentaUsuarioService;

    private CrudRepository<CuentaUsuario, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getRepository() {
        when(cuentaUsuarioRepository.findAll()).thenReturn((Iterable<CuentaUsuario>) crudRepository);
        assertNotNull(cuentaUsuarioService.getRepository());
    }
}