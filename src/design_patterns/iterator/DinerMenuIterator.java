package design_patterns.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }
}
