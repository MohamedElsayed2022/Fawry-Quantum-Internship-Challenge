package engines;

import interfaces.Engine;

public class ElectricEngine implements Engine {
    private int speed;
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void increase() { speed++; }
    public void decrease() { speed--; }

}
