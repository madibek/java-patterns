package kz.malgara;

import kz.malgara.fatorypattern.pizza.store.DodoPizza;
import kz.malgara.fatorypattern.pizza.product.Pizza;
import kz.malgara.fatorypattern.pizza.store.ItalianoPizza;
import kz.malgara.fatorypattern.pizza.store.PizzaStore;

import static kz.malgara.fatorypattern.pizza.factory.DodoPizzaFactory.PIZZA_DODO;
import static kz.malgara.fatorypattern.pizza.factory.DodoPizzaFactory.PIZZA_PEPPERONI;
import static kz.malgara.fatorypattern.pizza.factory.DodoPizzaFactory.PIZZA_CHEESE;
import static kz.malgara.fatorypattern.pizza.factory.ItalianoPizzaFactory.PIZZA_THIN_ITALIANO;

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

        PizzaStore italiano = new ItalianoPizza();
        Pizza italianoPizza = italiano.orderPizza(PIZZA_THIN_ITALIANO);
        System.out.println("PIZZA: " + italianoPizza.getName() + " --- DONE!!!");

    }
}
