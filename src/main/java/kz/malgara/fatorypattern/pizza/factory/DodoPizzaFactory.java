package kz.malgara.fatorypattern.pizza.factory;

import kz.malgara.fatorypattern.pizza.product.CheesePizza;
import kz.malgara.fatorypattern.pizza.product.DodoPizza;
import kz.malgara.fatorypattern.pizza.product.PepperoniPizza;
import kz.malgara.fatorypattern.pizza.product.Pizza;

public class DodoPizzaFactory {

    public static final String PIZZA_CHEESE = "cheese";
    public static final String PIZZA_PEPPERONI = "pepperoni";
    public static final String PIZZA_DODO = "dodo";

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (PIZZA_CHEESE.equals(type)) {
            pizza = new CheesePizza("Cheese Dodo");
        } else if (PIZZA_PEPPERONI.equals(type)) {
            pizza = new PepperoniPizza("Pepperoni Dodo");
        } else if (PIZZA_DODO.equals(type)) {
            pizza = new DodoPizza();
        }
        return pizza;
    }
}
