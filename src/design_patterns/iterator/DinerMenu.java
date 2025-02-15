package design_patterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        MenuItem mItem1 = new MenuItem("Vegetarian Sandwich", "Lettuce & tomato on whole wheat", true, 2.99);
        MenuItem mItem2 = new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 3.99);

        addItem(mItem1);
        addItem(mItem2);
    }

    public void addItem(MenuItem menuItem) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Overflow");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
