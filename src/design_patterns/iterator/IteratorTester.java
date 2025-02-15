package design_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTester {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        List<Menu> menus = new ArrayList<>(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
