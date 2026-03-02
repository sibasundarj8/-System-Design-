package Cars;

import Engines.Engine;

public class HatchBack extends Car {

    public HatchBack(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("HatchBack : ");
        super.drive();
    }

    @Override
    public void stop() {
        System.out.print("HatchBack : ");
        super.stop();
    }
}