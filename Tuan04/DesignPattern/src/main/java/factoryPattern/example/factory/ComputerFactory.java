package factoryPattern.example.factory;

import factoryPattern.example.model.PC;
import factoryPattern.example.model.Server;

public class ComputerFactory {

    public static factoryPattern.example.model.Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
