package org.example.kapsejlads23a.config;

import org.example.kapsejlads23a.model.BoatType;
import org.example.kapsejlads23a.model.Race;
import org.example.kapsejlads23a.model.Result;
import org.example.kapsejlads23a.model.Sailboat;
import org.example.kapsejlads23a.repositories.RaceRepository;
import org.example.kapsejlads23a.repositories.ResultRepository;
import org.example.kapsejlads23a.repositories.SailboatRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    SailboatRepository sailboatRepository;

    @Autowired
    RaceRepository raceRepository;

    @Autowired
    ResultRepository resultRepository;

    @Override
    public void run(String... args) throws Exception {

        Sailboat sailboat = new Sailboat();
        sailboat.setBoatType(BoatType.LONGERTHAN40);
        sailboat.setName("F24");
        sailboatRepository.save(sailboat);

        Sailboat sailboat2 = new Sailboat();
        sailboat2.setBoatType(BoatType.SMALLERTHAN25);
        sailboat2.setName("Bæveren");
        sailboatRepository.save(sailboat2);

        Sailboat sailboat3 = new Sailboat();
        sailboat3.setBoatType(BoatType.FROM25TO40);
        sailboat3.setName("Blå Svane");
        sailboatRepository.save(sailboat3);

        Sailboat sailboat4 = new Sailboat();
        sailboat4.setBoatType(BoatType.LONGERTHAN40);
        sailboat4.setName("Hans peter");
        sailboatRepository.save(sailboat4);

        Sailboat sailboat5 = new Sailboat();
        sailboat5.setBoatType(BoatType.FROM25TO40);
        sailboat5.setName("Prince of Denmark");
        sailboatRepository.save(sailboat5);

        Race race1 = new Race();
        race1.setBoatType(BoatType.LONGERTHAN40);
        race1.setRaceStart(LocalDate.of(2024, 05, 3));
        raceRepository.save(race1);

        Race race2 = new Race();
        race2.setBoatType(BoatType.SMALLERTHAN25);
        race2.setRaceStart(LocalDate.of(2024, 05, 3));
        raceRepository.save(race2);

        Race race3 = new Race();
        race3.setBoatType(BoatType.FROM25TO40);
        race3.setRaceStart(LocalDate.of(2024, 05, 3));
        raceRepository.save(race3);


        Result result1 = new Result();
        result1.setRace(race1);
        result1.setSailboat(sailboat);
        result1.setPoint(1);
        result1.setPosition(1);
        resultRepository.save(result1);


    }
}

