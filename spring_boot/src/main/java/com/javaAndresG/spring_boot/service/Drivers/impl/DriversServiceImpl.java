package com.javaAndresG.spring_boot.service.Drivers.impl;

import com.javaAndresG.spring_boot.dao.DriversRepository;
import com.javaAndresG.spring_boot.domain.Drivers.Drivers;
import com.javaAndresG.spring_boot.service.Drivers.DriversService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class DriversServiceImpl implements DriversService {

    private DriversRepository driversRepositoryJpa;

    public DriversServiceImpl(DriversRepository driversRepositoryJpa) {
        this.driversRepositoryJpa = driversRepositoryJpa;
    }

    @Override
    public List<Drivers> findAll() {
        return driversRepositoryJpa.findAll();
    }

    @Override
    public Drivers findByUuid(UUID driversUuid) {
        return driversRepositoryJpa.findByUuid(driversUuid);
    }

    @Override
    public Drivers save(Drivers driver) {
        return driversRepositoryJpa.save(driver);
    }

    @Override
    public Drivers update(Drivers driver) {
        var driversFound = driversRepositoryJpa.findByUuid(driver.getUuid());

        return driversRepositoryJpa.update(driversFound);
    }
}
