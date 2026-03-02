package Cars;

import Engines.Engine;

public class Suv extends Car {

    public Suv(Engine engine) {
        super(engine);
    }

    @Override
    public void stop() {
        System.out.print("SUV : ");
        super.stop();
    }

    @Override
    public void drive() {
        System.out.print("SUV : ");
        super.drive();
    }
}
