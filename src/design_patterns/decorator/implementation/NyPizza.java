package design_patterns.decorator.implementation;

import design_patterns.decorator.Pizza;

public class NyPizza implements Pizza {
    @Override
    public void display() {
        System.out.println("Ny Pizza");
    }

    @Override
    public double cost() {
        return 5.99;
    }
}
