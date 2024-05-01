package org.example.inheritanceinjava;

public class Main extends Vehicle {
    public Main(String make, String model) {
        super(make, model);
    }

    public Main() {
        super();
    }

    public static void main(String[] args) {
            Car car = new Car("Toyota","Corolla");
            System.out.println("Car Make:"+car.getMake());
            System.out.println("Car Model:"+car.getModel());
            car.start();
            car.stop();

            Truck truck = new Truck("Tata","F-150");
            System.out.println("Truck Make:"+truck.getMake());
            System.out.println("Truck Model:"+truck.getModel());
            truck.start();
            truck.stop();
            Main main =new Main();
            main.start();
        }

    @Override
    public void start() {
        System.out.println("main started");

    }
}


