package com.example.pruebatecnicatodo1.service;

import com.example.pruebatecnicatodo1.model.CuentaUsuario;
import com.example.pruebatecnicatodo1.model.DataId;
import com.example.pruebatecnicatodo1.repository.CuentaUsuarioRepository;
import com.example.pruebatecnicatodo1.repository.DataIdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.repository.CrudRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DataIdServiceTest {

    @Mock
    private DataIdRepository dataIdRepository;

    @InjectMocks
    private DataIdService dataIdService;

    private CrudRepository<DataId, Long> crudRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getRepository() {
        when(dataIdRepository.findAll()).thenReturn((Iterable<DataId>) crudRepository);
        assertNotNull(dataIdService.getRepository());
    }
}