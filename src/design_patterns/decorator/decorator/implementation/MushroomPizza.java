package design_patterns.decorator.decorator.implementation;

import design_patterns.decorator.Pizza;
import design_patterns.decorator.decorator.PizzaDecorator;

public class MushroomPizza extends PizzaDecorator {
    public MushroomPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void display() {
        pizza.display();
        System.out.println(" with mushrooms");
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.49;
    }
}
