package org.example.kapsejlads23a.service;

import org.example.kapsejlads23a.model.Sailboat;
import org.example.kapsejlads23a.repositories.SailboatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SailboatService {

    @Autowired
    SailboatRepository sailboatRepository;

    public List<Sailboat> getAll() {
        return sailboatRepository.findAll();
    }

    public ResponseEntity<Sailboat> updateSailboat(String id, Sailboat sailboat) {
        int iid = Integer.parseInt(id);
        Optional<Sailboat> boatOptional = sailboatRepository.findById(iid);
        if (boatOptional.isPresent()) {
            sailboat.setBoatID(iid);
            sailboatRepository.save(sailboat);
            return new ResponseEntity<>(sailboat, HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Sailboat> deleteSailboat(String id) {
        int iid = Integer.parseInt(id);
        Optional<Sailboat> boatOptional = sailboatRepository.findById(iid);
        if (boatOptional.isPresent()) {
            sailboatRepository.deleteById(iid);
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
