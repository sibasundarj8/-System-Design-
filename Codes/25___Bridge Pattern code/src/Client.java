import Cars.Car;
import Cars.HatchBack;
import Cars.Sedan;
import Cars.Suv;
import Engines.DieselEngine;
import Engines.ElectricEngine;
import Engines.PetrolEngine;

public class Client {
    public static void main(String[] args) {
        Car petrolSuv = new Suv(new PetrolEngine());
        Car electricSuv = new Suv(new ElectricEngine());
        Car dieselSuv = new Suv(new DieselEngine());

        Car petrolSaden = new Sedan(new PetrolEngine());
        Car dieselSedan = new Sedan(new DieselEngine());
        Car electricSedan = new Sedan(new ElectricEngine());

        Car petrolHatchBack = new HatchBack(new PetrolEngine());
        Car dieselHatchBack = new HatchBack(new DieselEngine());
        Car electricHatchBack = new HatchBack(new ElectricEngine());

        petrolSuv.drive();
        petrolSuv.stop();

        dieselSuv.drive();
        dieselSuv.stop();

        electricSuv.drive();
        electricSuv.stop();

        petrolSaden.drive();
        petrolSaden.stop();

        dieselSedan.drive();
        dieselSedan.stop();

        electricSedan.drive();
        electricSedan.stop();

        petrolHatchBack.drive();
        petrolHatchBack.stop();

        dieselHatchBack.drive();
        dieselHatchBack.stop();

        electricHatchBack.drive();
        electricHatchBack.stop();
    }
}
