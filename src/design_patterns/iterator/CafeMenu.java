package design_patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu () {
        MenuItem mItem1 = new MenuItem("Coffee", "Plain black coffee", true, 2.99);
        MenuItem mItem2 = new MenuItem("Ice coffee", "Iced black coffee", true, 3.99);

        addItem(mItem1);
        addItem(mItem2);
    }

    public void addItem(MenuItem menuItem) {
        menuItems.put(menuItem.getName(), menuItem);
    }
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
