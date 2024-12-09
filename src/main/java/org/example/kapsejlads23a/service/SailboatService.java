package org.example.kapsejlads23a.service;

import org.example.kapsejlads23a.model.Sailboat;
import org.example.kapsejlads23a.repositories.SailboatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SailboatService {

    @Autowired
    SailboatRepository sailboatRepository;

    public List<Sailboat> getAll() {
        return sailboatRepository.findAll();
    }


}
