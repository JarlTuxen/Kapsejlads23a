package org.example.kapsejlads23a.controller;

import org.example.kapsejlads23a.model.Race;
import org.example.kapsejlads23a.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RaceController {

    @Autowired
    RaceService raceService;

    @GetMapping("/races")
    public List<Race> allData() {
        return raceService.getAll();
    }


}
