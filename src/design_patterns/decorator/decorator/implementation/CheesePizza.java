package design_patterns.decorator.decorator.implementation;

import design_patterns.decorator.Pizza;
import design_patterns.decorator.decorator.PizzaDecorator;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void display() {
        // Can decorate either before or after.
        // Here, we are decorating after the delegation call
        pizza.display();
        System.out.println(" with Cheese");
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.99;
    }
}
