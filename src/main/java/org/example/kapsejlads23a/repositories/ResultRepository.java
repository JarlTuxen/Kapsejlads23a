package org.example.kapsejlads23a.repositories;

import org.example.kapsejlads23a.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Integer> {

    List<Result> findResultByRaceRaceID(int raceID);
    List<Result> findResultBySailboatBoatID(int sailboatID);

}
