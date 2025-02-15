package design_patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> iterator = menus.iterator();

        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());

        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getPrice());
        }
    }
}
