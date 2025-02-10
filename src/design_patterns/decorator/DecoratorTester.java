package design_patterns.decorator;

import design_patterns.decorator.decorator.implementation.CheesePizza;
import design_patterns.decorator.decorator.implementation.MushroomPizza;
import design_patterns.decorator.decorator.implementation.PepperoniPizza;
import design_patterns.decorator.implementation.LaPizza;
import design_patterns.decorator.implementation.NyPizza;

public class DecoratorTester {
    public static void main(String[] args) {

        Pizza nyPizza = new NyPizza();
        nyPizza = new MushroomPizza(nyPizza);
        nyPizza = new CheesePizza(nyPizza);
        nyPizza.display();
        System.out.println(nyPizza.cost());

        Pizza laPizza = new LaPizza();
        laPizza = new PepperoniPizza(laPizza);
        laPizza.display();
        System.out.println(laPizza.cost());
    }
}
