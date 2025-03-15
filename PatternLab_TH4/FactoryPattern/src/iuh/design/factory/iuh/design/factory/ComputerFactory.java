package iuh.design.factory;


import iuh.design.model.Computer;
import iuh.design.model.PC;
import iuh.design.model.Server;

public class ComputerFactory {
 public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}


