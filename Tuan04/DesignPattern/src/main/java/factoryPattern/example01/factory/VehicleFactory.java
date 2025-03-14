package factoryPattern.example01.factory;

import factoryPattern.example01.model.Bike;
import factoryPattern.example01.model.Car;
import factoryPattern.example01.model.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }
}
