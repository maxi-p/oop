package design_patterns.decorator.decorator.implementation;

import design_patterns.decorator.Pizza;
import design_patterns.decorator.decorator.PizzaDecorator;

public class PepperoniPizza extends PizzaDecorator {
    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void display() {
        pizza.display();
        System.out.println(" with pepperoni");
    }

    @Override
    public double cost() {
        return pizza.cost() + 3.49;
    }
}
