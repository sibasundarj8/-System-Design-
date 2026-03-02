package Cars;

import Engines.Engine;

public class Sedan extends Car {

    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void stop() {
        System.out.print("Sedan : ");
        super.stop();
    }

    @Override
    public void drive() {
        System.out.print("Sedan : ");
        super.drive();
    }
}