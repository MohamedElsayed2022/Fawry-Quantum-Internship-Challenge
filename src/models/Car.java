package models;

import interfaces.Engine;

public class Car {
    private Engine engine;
    private int speed = 0;
    public Car(Engine engine) {
        this.engine = engine;
    }
   public void start(){
       speed = 0;
       engine.setSpeed(speed);
       System.out.println("Car Started And Speed : " + speed);
   }
    public void stop(){
       speed = 0;
       engine.setSpeed(speed);
        System.out.println("Car Stopped");
    }
    public void accelerate(){
       if(speed <= 200){
           speed+=20;
           engine.setSpeed(speed);
           System.out.println("Car Accelerated And Speed : " +  speed);
       }
    }
    public void brake(){
      if(speed >0){
          speed-=20;
          engine.setSpeed(speed);
          System.out.println("Car Braked And Speed : " + speed);
      }
    }
    public void changeEngine(Engine newEngine) {
        this.engine = newEngine;
        System.out.println("Engine Changed");
    }
}
