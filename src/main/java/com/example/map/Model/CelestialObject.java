package com.example.map.Model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "celestialobjects")
public class CelestialObject implements Serializable {

    @Id
    private int id;
    private String type;
    private String name;
    private String mass;
    private String specs;
    private double size;
    private String composition;
    private double temperature;
    private double luminosity;
    private int criticalMass;

    @ManyToMany
    @JoinTable(
            name = "celestialobject_resource",
            joinColumns = @JoinColumn(name = "celestialobject_id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id")
    )
    private List<Resource> resources;

    public CelestialObject() {
    }


    public CelestialObject(int id, String type, String name, String mass, String specs, double size, String composition, double temperature, double luminosity, int criticalMass,  List<Resource> resources) {

        this.id = id;
        this.type = type;
        this.name = name;
        this.mass = mass;
        this.specs = specs;
        this.size = size;
        this.composition = composition;
        this.temperature = temperature;
        this.luminosity = luminosity;
        this.criticalMass = criticalMass;
        this.resources = resources;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(double luminosity) {
        this.luminosity = luminosity;
    }

    public double getCriticalMass() {
        return criticalMass;
    }

    public void setCriticalMass(int criticalMass) {
        this.criticalMass = criticalMass;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}
