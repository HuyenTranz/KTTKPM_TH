package factoryPattern.example01.model;

// Bike.java
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}
