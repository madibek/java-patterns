package kz.malgara.iteratorpattern.aggregate;

import kz.malgara.iteratorpattern.iterator.Iterator;
import kz.malgara.iteratorpattern.iterator.LunchMenuIterator;

public class LunchMenu implements Aggregate {

    private String[] menuItems;

    public LunchMenu() {
        this.menuItems = new String[] {
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5"
        };
    }

    @Override
    public Iterator createIterator() {
        return new LunchMenuIterator(this);
    }

    public String[] getMenuItems() {
        return menuItems;
    }
}
