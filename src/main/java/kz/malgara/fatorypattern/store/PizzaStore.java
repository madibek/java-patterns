package kz.malgara.fatorypattern.store;

import kz.malgara.fatorypattern.product.Pizza;

public interface PizzaStore {

    Pizza orderPizza(String type);

    Pizza createPizza(String type);
}
