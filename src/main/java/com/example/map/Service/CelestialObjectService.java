package com.example.map.Service;

import com.example.map.Model.CelestialObject;
import com.example.map.Repository.CelestialObjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CelestialObjectService {

    @Autowired
    public CelestialObjectRepo celestialObjectRepo;

    public List<CelestialObject> getAllCelestialObjects()
    {
        List<CelestialObject> celestialObjects = new ArrayList<>();
        celestialObjectRepo.findAll().forEach(celestialObjects::add);
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject)
    {
        celestialObjectRepo.save(celestialObject);
    }

    public void updateCelestialObject(String id, CelestialObject celestialObject)
    {
        celestialObjectRepo.save(celestialObject);
    }

    public void deleteCelestialObject(String id)
    {
        celestialObjectRepo.deleteById(id);
    }
}
