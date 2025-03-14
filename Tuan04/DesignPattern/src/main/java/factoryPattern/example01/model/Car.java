package factoryPattern.example01.model;

// Car.java
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
