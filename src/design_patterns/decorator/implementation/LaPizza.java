package design_patterns.decorator.implementation;

import design_patterns.decorator.Pizza;

public class LaPizza implements Pizza {
    @Override
    public void display() {
        System.out.println("LA Pizza");
    }

    @Override
    public double cost() {
        return 4.99;
    }
}
