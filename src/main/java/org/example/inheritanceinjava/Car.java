package org.example.inheritanceinjava;

public class Car extends Vehicle{

    public Car(String make, String model) {
        super(make, model);
    }

    // Implementing the abstract method start() for Car
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
