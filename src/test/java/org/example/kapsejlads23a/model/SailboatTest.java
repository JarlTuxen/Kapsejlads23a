package org.example.kapsejlads23a.model;

import org.example.kapsejlads23a.repositories.RaceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SailboatTest {

    @Autowired
    RaceRepository raceRepository;

    @Test
    void testAlleOnsdage2() {

        List<LocalDate> wednesdays = Stream.iterate(LocalDate.of(2025, 1, 1), date -> date.plusWeeks(1))
                .filter(date -> date.getDayOfWeek().getValue() == 3) // Wednesday is the 3rd day of the week
                .takeWhile(date -> date.getYear() == 2025)
                .collect(Collectors.toList());

        wednesdays.forEach(System.out::println);
    }

    @Test
    void testAlleOnsdage() {
        List<LocalDate> lstWed = Stream.iterate(LocalDate.of(2025, 5, 1), date -> date.plusDays(1))
                .limit(31)
                .filter(date -> date.getDayOfWeek() == DayOfWeek.WEDNESDAY)
                .toList();
        System.out.println(lstWed.size());

        lstWed.forEach(day -> {
            Race race = new Race();
            race.setRaceStart(day);
            raceRepository.save(race);
        });

    }


}