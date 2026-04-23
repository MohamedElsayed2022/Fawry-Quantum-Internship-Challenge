import models.Car;
import factory.CarFactory;
import engines.GasEngine;

void main() {

    String breaks = "---------------------------------------";
    Car car = CarFactory.createCar("hybrid");

    assert car != null;
    car.start();
    System.out.println(breaks);
    car.accelerate();
    System.out.println(breaks);
    car.accelerate();
    System.out.println(breaks);
    car.accelerate();
    System.out.println(breaks);
    car.brake();
    System.out.println(breaks);
    car.stop();

    car.changeEngine(new GasEngine());
    car.start();

}
