package com.example.map.Service;

import com.example.map.Model.Cargo;
import com.example.map.Repository.CargoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CargoService {

    @Autowired
    public CargoRepo cargoRepo;

    public List<Cargo> getAllCargos()
    {
        List<Cargo> cargos = new ArrayList<>();
        cargoRepo.findAll().forEach(cargos::add);
        return cargos;
    }

    public void addCargo(Cargo cargo)
    {
        cargoRepo.save(cargo);
    }

    public void updateCargo(String id, Cargo cargo)
    {
        cargoRepo.save(cargo);
    }

    public void deleteCargo(String id)
    {
        cargoRepo.deleteById(id);
    }
}
