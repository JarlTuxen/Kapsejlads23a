package org.example.kapsejlads23a.service;

import org.example.kapsejlads23a.model.Result;
import org.example.kapsejlads23a.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    ResultRepository resultRepository;


    public List<Result> getAll() {
        return resultRepository.findAll();
    }

    public List<Result> getResultsByRaceId(String raceId) {
        int i1 = Integer.parseInt(raceId);
        var obj = resultRepository.findResultByRaceRaceID(i1);
        return obj;
    }

    public List<Result> getResultsByBoatId(String raceId) {
        int i1 = Integer.parseInt(raceId);
        var obj = resultRepository.findResultBySailboatBoatID(i1);
        return obj;
    }

}
