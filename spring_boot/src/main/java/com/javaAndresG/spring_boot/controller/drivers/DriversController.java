package com.javaAndresG.spring_boot.controller.drivers;

import com.javaAndresG.spring_boot.domain.Drivers.Drivers;
import com.javaAndresG.spring_boot.service.Drivers.DriversService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriversController {
    private DriversService driversService;

    public DriversController(DriversService driversService) {
        this.driversService = driversService;
    }

    @GetMapping("/drivers")
    public List<Drivers> findAll(){
        return driversService.findAll();
    }

    @PostMapping("/drivers/save")
    public Drivers save(@RequestBody Drivers drivers){
        return driversService.save(drivers);
    }

    @PostMapping("/drivers/update")
    public Drivers update(@RequestBody Drivers drivers){
        return driversService.save(drivers);
    }
}
