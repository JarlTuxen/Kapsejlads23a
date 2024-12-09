package org.example.kapsejlads23a.service;

import org.example.kapsejlads23a.model.Race;
import org.example.kapsejlads23a.repositories.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    @Autowired
    RaceRepository raceRepository;

    public List<Race> getAll() {

        return raceRepository.findAll();
    }



}
