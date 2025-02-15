package design_patterns.iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        MenuItem mItem1 = new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        MenuItem mItem2 = new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);
        MenuItem mItem3 = new MenuItem("Blueberry Pancake", "Pancakes with fresh blueberries", true, 3.49);

        addItem(mItem1);
        addItem(mItem2);
        addItem(mItem3);
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
