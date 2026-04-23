package engines;

import interfaces.Engine;

public class GasEngine implements Engine {
    private int speed;
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void increase() {
        speed++;
    }
    @Override
    public void decrease() {
        speed--;
    }


}
