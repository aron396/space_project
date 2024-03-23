package com.example.map.Model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cargos")
public class Cargo implements Serializable {

    @Id
    private int id;
    private String name;
    private int quantity;
    private double value;

    @ManyToMany
    @JoinTable(
            name = "cargo_resource",
            joinColumns = @JoinColumn(name = "cargo_id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id")
    )
    private List<Resource> resources;

    public Cargo() {
    }


    public Cargo(int id, String name, int quantity, double value , List<Resource> resources) {

        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.value = value;
        this.resources = resources;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}
