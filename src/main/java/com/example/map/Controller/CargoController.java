package com.example.map.Controller;

import com.example.map.Model.Cargo;
import com.example.map.Service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @RequestMapping(method = RequestMethod.GET, value = "/cargo")
    public List<Cargo> getAllCargos()
    {
        return cargoService.getAllCargos();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cargo")
    public void addCargo(@RequestBody Cargo Cargo)
    {
        cargoService.addCargo(Cargo);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cargo/{id}")
    public void updateCargo(@PathVariable String id, @RequestBody Cargo cargo)
    {
        cargoService.updateCargo(id, cargo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cargo/{id}")
    public void DeleteCargo(@PathVariable String id)
    {
        cargoService.deleteCargo(id);
    }

}
