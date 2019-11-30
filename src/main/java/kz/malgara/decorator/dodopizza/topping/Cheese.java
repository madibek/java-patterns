package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.Pizza;

public class Cheese extends Pizza {

    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", cheese";
    }

    @Override
    public int getCost() {
        return 130 + this.pizza.getCost();
    }
}
