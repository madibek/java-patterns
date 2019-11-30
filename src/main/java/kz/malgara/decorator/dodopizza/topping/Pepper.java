package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.Pizza;

public class Pepper extends Pizza {

    private Pizza pizza;

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", pepper";
    }

    @Override
    public int getCost() {
        return 50 + this.pizza.getCost();
    }
}
