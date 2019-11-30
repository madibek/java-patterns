package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.Pizza;

public class Olives extends Pizza {

    private Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
        this.description = this.pizza.getDescription() + ", olives";
    }

    @Override
    public int getCost() {
        return 110 + this.pizza.getCost();
    }
}
