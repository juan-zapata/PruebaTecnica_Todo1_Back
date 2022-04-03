package com.example.pruebatecnicatodo1.service;


import com.example.pruebatecnicatodo1.model.DataId;
import com.example.pruebatecnicatodo1.repository.DataIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DataIdService extends GeneralServiceImpl<DataId, Long> {
    @Autowired
    private DataIdRepository dataIdRepository;

    @Override
    public CrudRepository<DataId, Long> getRepository() {
        return dataIdRepository;
    }
}
