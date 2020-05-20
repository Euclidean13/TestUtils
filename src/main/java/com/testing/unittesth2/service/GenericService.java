package com.testing.unittesth2.service;

import com.testing.unittesth2.entities.GenericEntity;
import com.testing.unittesth2.repository.GenericEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericService {

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    public List<GenericEntity> getAllValues() {
        return genericEntityRepository.findAll();
    }
}
