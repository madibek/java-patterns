package kz.malgara.iteratorpattern.iterator;

import kz.malgara.iteratorpattern.aggregate.DinerMenu;

import java.util.List;

public class DinerMenuIterator implements Iterator {

    private List<String> items;
    private int count;

    public DinerMenuIterator(DinerMenu dinerMenu) {
        this.items = dinerMenu.getMenuItems();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return this.count < this.items.size();
    }

    @Override
    public String next() {
        return items.get(this.count++);
    }
}
