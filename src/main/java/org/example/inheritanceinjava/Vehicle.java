package org.example.inheritanceinjava;
abstract class Vehicle {

    public String make;
    public String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Vehicle() {

    }

    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}


