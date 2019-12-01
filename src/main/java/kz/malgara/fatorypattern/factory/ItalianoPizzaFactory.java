package kz.malgara.fatorypattern.factory;

import kz.malgara.fatorypattern.product.Pizza;
import kz.malgara.fatorypattern.product.ThinPizza;

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
