package engines;

import interfaces.Engine;

public class HybridEngine implements Engine {
    ElectricEngine electricEngine = new ElectricEngine();
    GasEngine gasEngine = new GasEngine();
    public void increase() {}
    public void decrease() {}
    public void setSpeed(int speed) {
       if(speed < 50 ){
           System.out.println("Hybrid Using Electric Engine");
           electricEngine.setSpeed(speed);
       }else{
           System.out.println("Hybrid Using Gas Engine");
           gasEngine.setSpeed(speed);
       }
    }
}
