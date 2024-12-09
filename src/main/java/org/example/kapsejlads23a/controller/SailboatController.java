package org.example.kapsejlads23a.controller;

import org.example.kapsejlads23a.model.Sailboat;
import org.example.kapsejlads23a.service.SailboatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
