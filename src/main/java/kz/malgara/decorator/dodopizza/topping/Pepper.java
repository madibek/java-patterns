package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.pizza.PizzaComponent;

public class Pepper extends ToppingDecorator {

    public Pepper(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        this.description = this.pizzaComponent.getDescription() + ", pepper";
    }

    @Override
    public int getCost() {
        return 50 + this.pizzaComponent.getCost();
    }
}
