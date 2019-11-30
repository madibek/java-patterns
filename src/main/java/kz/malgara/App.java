package kz.malgara;

import kz.malgara.iteratorpattern.iterator.Iterator;
import kz.malgara.iteratorpattern.aggregate.DinerMenu;
import kz.malgara.iteratorpattern.aggregate.LunchMenu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Iterator pattern demo!!!" );
        LunchMenu lunchMenu = new LunchMenu();
        DinerMenu dinerMenu = new DinerMenu();

        printMenu(lunchMenu.createIterator());
        System.out.println("\n");
        printMenu(dinerMenu.createIterator());
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("Menu: " + iterator.next());
        }
    }
}
