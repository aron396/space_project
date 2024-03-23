package com.example.map.Controller;

import com.example.map.Model.CelestialObject;
import com.example.map.Service.CelestialObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CelestialObjectController {

    @Autowired
    private CelestialObjectService celestialObjectService;

    @RequestMapping(method = RequestMethod.GET, value = "/celestialobj")
    public List<CelestialObject> getAllCelestialObjects()
    {
        return celestialObjectService.getAllCelestialObjects();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/celestialobj")
    public void addCelestialObject(@RequestBody CelestialObject celestialObject)
    {
        celestialObjectService.addCelestialObject(celestialObject);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/celestialobj/{id}")
    public void updateCelestialObject(@PathVariable String id, @RequestBody CelestialObject celestialObject)
    {
        celestialObjectService.updateCelestialObject(id, celestialObject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/celestialobj/{id}")
    public void DeleteCelestiaLObject(@PathVariable String id)
    {
        celestialObjectService.deleteCelestialObject(id);
    }

}
