package factory;

import engines.ElectricEngine;
import engines.GasEngine;
import engines.HybridEngine;
import models.Car;

public class CarFactory {

    public static Car createCar(String type) {
        return switch (type) {
            case "gas" -> new Car(new GasEngine());
            case "electric" -> new Car(new ElectricEngine());
            case "hybrid" -> new Car(new HybridEngine());
            default -> {
                System.out.println("Invalid Type");
                yield null;
            }
        };
    }
}