package design_patterns.facade;

import design_patterns.facade.impl.EngineBMW;
import design_patterns.facade.impl.KeyBMW;
import design_patterns.facade.impl.TransmissionBMW;

public class CarFacade {
    public Key key;
    public Engine engine;
    public Transmission transmission;

    public CarFacade(Key key, Engine engine, Transmission transmission){
        this.key = key;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void startCar() {
        key.insert();
        key.turn();
        engine.start();
        transmission.shiftToDrive();
    }

    public void stopCar() {
        transmission.shiftToPark();
        engine.stop();
        key.remove();
    }

    public static void main(String[] args) {
        Key keyBMW = new KeyBMW();
        Engine engineBMW = new EngineBMW();
        Transmission transmissionBMW = new TransmissionBMW();

        CarFacade carBMW = new CarFacade(keyBMW, engineBMW, transmissionBMW);

        carBMW.startCar();
        System.out.println();
        carBMW.stopCar();
    }

    // principle of Least Knowledge (Close Friend Objects Only)
    public void demeterLaw(Key key) {
        // It's a good practice to follow this principle
        // Only call methods of objects that are:
        Engine engine = new EngineBMW();
        engine.start(); // 1. Created/Instantiated within the method
        key.turn(); // 2. Passed as arguments to the method
        this.updateDashboardDisplay(); // 3. The object that owns the current method (this/self)
        transmission.shiftToDrive(); // 4. Component object of the current object

        // This principle decreases coupling but increases amount of wrapper classes and runtime. Trade off.
    }

    public void updateDashboardDisplay() {
        System.out.println("Dashboard display activated");
    }
}
