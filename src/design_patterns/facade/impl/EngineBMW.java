package design_patterns.facade.impl;

import design_patterns.facade.Engine;

public class EngineBMW implements Engine {
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }
}
