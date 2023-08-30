package com.javaAndresG.spring_boot.service.Drivers;

import com.javaAndresG.spring_boot.domain.Drivers.Drivers;

import java.util.List;
import java.util.UUID;

public interface DriversService {
    public List<Drivers> findAll();

    Drivers findByUuid(UUID driversUuid);

    Drivers save(Drivers driver);

    Drivers update(Drivers driver);
}
