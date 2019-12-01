package kz.malgara;

import kz.malgara.fatorypattern.store.DodoPizza;
import kz.malgara.fatorypattern.product.Pizza;
import kz.malgara.fatorypattern.store.PizzaStore;

import static kz.malgara.fatorypattern.factory.PizzaFactory.PIZZA_DODO;
import static kz.malgara.fatorypattern.factory.PizzaFactory.PIZZA_PEPPERONI;
import static kz.malgara.fatorypattern.factory.PizzaFactory.PIZZA_CHEESE;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Factory pattern implementation!!!" );
        PizzaStore dodo = new DodoPizza();
        Pizza cheeseDodo = dodo.orderPizza(PIZZA_CHEESE);
        Pizza pepperoniDodo = dodo.orderPizza(PIZZA_PEPPERONI);
        Pizza dodoPizza = dodo.orderPizza(PIZZA_DODO);

        System.out.println("PIZZA: " + cheeseDodo.getName() + " --- DONE!!!");
        System.out.println("PIZZA: " + pepperoniDodo.getName() + " --- DONE!!!");
        System.out.println("PIZZA: " + dodoPizza.getName() + " --- DONE!!!");
    }
}
