package com.example.map.Model;

import java.util.HashSet;

// Proxy class for CelestialObject
public class CelestialObjectProxy extends CelestialObject {
    private boolean isRealObjectInitialized = false;

    public CelestialObjectProxy(String type, String name, String mass, String specs, HashSet<Resource> resources, double size, String composition, double temperature, double luminosity, double criticalMass) {
        //super(type, name, mass, specs, resources, size, composition, temperature, luminosity, criticalMass);
    }

    // Lazy initialization of the real CelestialObject
    private void initializeRealObject() {
        if (!isRealObjectInitialized) {
            // Additional logic for initialization if needed
            isRealObjectInitialized = true;
        }
    }

    //@Override
    public void explore() {
        // Log before exploration
        System.out.println("Logging: Before exploring " + getName());

        // Lazy initialization of the real CelestialObject
        initializeRealObject();

        // Actual exploration logic
        System.out.println("Exploring the " + getType() + " " + getName() + " with a composition of " + getComposition() +
                ". It has specifications: " + getSpecs() + ", resources: "  /*getResourceNames()*/ +
                ". It has a radius of " + getSize() + " and a mass of " + getMass() + " kg.");

        // Log after exploration
        System.out.println("Logging: After exploring " + getName());
    }
}
