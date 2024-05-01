package org.example.inheritanceinjava;

 class Truck extends Vehicle {

     public Truck(String make, String model) {
         super(make, model);
     }

     @Override
     public void start() {
         System.out.println("Truck Sarted.");


     }


 }

