package kz.malgara.fatorypattern.pizza.factory;

import kz.malgara.fatorypattern.pizza.product.Pizza;
import kz.malgara.fatorypattern.pizza.product.ThinPizza;

public class ItalianoPizzaFactory {

    public static final String PIZZA_THIN_ITALIANO = "thin";

    public Pizza createPizza(String type) {

        switch (type) {
            case PIZZA_THIN_ITALIANO:
                return new ThinPizza();
            default:
                return null;
        }
    }
}
