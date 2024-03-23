package com.example.map.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "celestialobject_resource",
            joinColumns = @JoinColumn(name = "resource_id"),
            inverseJoinColumns = @JoinColumn(name = "celestialobject_id")
    )
    @JsonIgnore
    private List<CelestialObject> celestialObjectList;

    @ManyToMany
    @JoinTable(
            name = "cargo_resource",
            joinColumns = @JoinColumn(name = "resource_id"),
            inverseJoinColumns = @JoinColumn(name = "cargo_id")
    )
    @JsonIgnore
    private List<Cargo> cargoList;

    public Resource() {
    }

    public Resource(int id, String name, List<CelestialObject> celestialObjectList, List<Cargo> cargoList) {
        this.id = id;
        this.name = name;
        this.celestialObjectList = celestialObjectList;
        this.cargoList = cargoList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CelestialObject> getCelestialObjectList() {
        return celestialObjectList;
    }

    public void setCelestialObjectList(List<CelestialObject> celestialObjectList) {
        this.celestialObjectList = celestialObjectList;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }
}
