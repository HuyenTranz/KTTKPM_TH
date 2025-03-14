package factoryPattern.example01;

import factoryPattern.example01.factory.VehicleFactory;
import factoryPattern.example01.model.Vehicle;

public class TestFactory {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();  // Output: Driving a car...

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.drive();  // Output: Riding a bike...
    }
}
