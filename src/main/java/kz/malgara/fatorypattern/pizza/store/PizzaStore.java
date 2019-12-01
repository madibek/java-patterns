package kz.malgara.fatorypattern.pizza.store;

import kz.malgara.fatorypattern.pizza.product.Pizza;

public interface PizzaStore {

    Pizza orderPizza(String type);

    Pizza createPizza(String type);
}
