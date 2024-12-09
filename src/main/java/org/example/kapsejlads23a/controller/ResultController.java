package org.example.kapsejlads23a.controller;

import org.example.kapsejlads23a.model.Result;
import org.example.kapsejlads23a.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
public class ResultController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/results")
    public List<Result> allData() {
        return resultService.getAll();
    }

    @GetMapping("/resultsbyraceid/{id}")
    public List<Result> getResultsByRaceId(@PathVariable String id) {
        return resultService.getResultsByRaceId(id);
    }

    @GetMapping("/resultsbyboatid/{id}")
    public List<Result> getResultsByBoatId(@PathVariable String id) {
        return resultService.getResultsByBoatId(id);
    }


}
