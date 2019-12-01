package kz.malgara.fatorypattern.store;

import kz.malgara.fatorypattern.factory.ItalianoPizzaFactory;
import kz.malgara.fatorypattern.product.Pizza;

public class ItalianoPizza implements PizzaStore {

    private ItalianoPizzaFactory factory;

    public ItalianoPizza() {
        this.factory = new ItalianoPizzaFactory();
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
