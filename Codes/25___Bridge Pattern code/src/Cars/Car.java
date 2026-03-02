package Cars;

import Engines.Engine;

public abstract class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.print("Driving --> ");
        engine.start();
    }

    public void stop() {
        System.out.print("Stopping --> ");
        engine.stop();
    }
}
