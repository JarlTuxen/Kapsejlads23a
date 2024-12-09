package org.example.kapsejlads23a.controller;

import org.example.kapsejlads23a.model.Sailboat;
import org.example.kapsejlads23a.service.SailboatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SailboatController {

    @Autowired
    SailboatService sailboatService;

    @GetMapping("/sailboats")
    public List<Sailboat> allData() {
        return sailboatService.getAll();
    }

    @PutMapping("/sailboat/{id}")
    public ResponseEntity<Sailboat> updateRestaurantx(@PathVariable String id, @RequestBody Sailboat sailboat) {
        return sailboatService.updateSailboat(id, sailboat);
    }

    @DeleteMapping("/sailboat/{id}")
    public ResponseEntity<Sailboat> deleteData(@PathVariable String id) {
        return sailboatService.deleteSailboat(id);
    }


}

