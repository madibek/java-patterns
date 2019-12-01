package kz.malgara.fatorypattern.store;

import kz.malgara.fatorypattern.product.Pizza;
import kz.malgara.fatorypattern.factory.DodoPizzaFactory;

public class DodoPizza implements PizzaStore {

    private DodoPizzaFactory factory;

    public DodoPizza() {
        this.factory = new DodoPizzaFactory();
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cook();
        return pizza;
    }

    @Override
    public Pizza createPizza(String type) {
        return factory.createPizza(type);
    }
}
