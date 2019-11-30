package kz.malgara.iteratorpattern.aggregate;

import kz.malgara.iteratorpattern.iterator.DinerMenuIterator;
import kz.malgara.iteratorpattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DinerMenu implements Aggregate {

    private List<String> menuItems;

    public DinerMenu() {
        this.menuItems = new ArrayList<>();
        this.menuItems.add("Diner item 1");
        this.menuItems.add("Diner item 2");
        this.menuItems.add("Diner item 3");
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(this);
    }

    public List<String> getMenuItems() {
        return menuItems;
    }
}
