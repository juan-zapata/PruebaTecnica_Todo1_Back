package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.CuentaUsuario;
import com.example.pruebatecnicatodo1.repository.CuentaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CuentaUsuarioService extends GeneralServiceImpl<CuentaUsuario, Long> {

    @Autowired
    private CuentaUsuarioRepository cuentaUsuarioRepository;

    @Override
    public CrudRepository<CuentaUsuario, Long> getRepository() {
        return cuentaUsuarioRepository;
    }
}
