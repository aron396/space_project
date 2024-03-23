package com.example.map.Repository;

import com.example.map.Model.CelestialObject;
import org.springframework.data.repository.CrudRepository;

public interface CelestialObjectRepo extends CrudRepository<CelestialObject,String> {
}
