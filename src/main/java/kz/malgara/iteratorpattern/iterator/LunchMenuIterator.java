package kz.malgara.iteratorpattern.iterator;

import kz.malgara.iteratorpattern.aggregate.LunchMenu;

public class LunchMenuIterator implements Iterator {

    private String[] items;
    private int cout;

    public LunchMenuIterator(LunchMenu lunchMenu) {
        this.items = lunchMenu.getMenuItems();
        this.cout = 0;
    }

    @Override
    public boolean hasNext() {
        return this.cout < this.items.length;
    }

    @Override
    public String next() {
        return this.items[this.cout++];
    }

}
