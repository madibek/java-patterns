package kz.malgara.fatorypattern.store;

import kz.malgara.fatorypattern.product.Pizza;
import kz.malgara.fatorypattern.factory.PizzaFactory;

public class DodoPizza implements PizzaStore {

    private PizzaFactory factory;

    public DodoPizza() {
        this.factory = new PizzaFactory();
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.cook();
        return pizza;
    }
}
