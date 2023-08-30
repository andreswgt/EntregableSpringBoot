package com.javaAndresG.spring_boot.dao;

import com.javaAndresG.spring_boot.domain.Drivers.Drivers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class DriversRepository {
    private List<Drivers> drivers = new ArrayList<>();

    public List<Drivers> findAll() {

        return drivers;
    }

    public Drivers findByUuid(UUID driversUuid) {

        return drivers.stream().filter(drivers -> drivers.getUuid().equals(driversUuid))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Drivers not found"));
    }

    public Drivers save(Drivers driver) {

        driver.setUuid(UUID.randomUUID());

        drivers.add(driver);

        return driver;
    }

    public Drivers update(Drivers driver) {

        return driver;
    }
}
