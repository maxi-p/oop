package design_patterns.facade.impl;

import design_patterns.facade.Transmission;

public class TransmissionBMW implements Transmission {
    @Override
    public void shiftToDrive() {
        System.out.println("Transmission shifted to drive");
    }

    @Override
    public void shiftToPark(){
        System.out.println("Transmission shifted to park");
    }

}
