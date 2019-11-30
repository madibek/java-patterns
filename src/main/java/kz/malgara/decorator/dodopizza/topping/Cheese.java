package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.pizza.PizzaComponent;

public class Cheese extends ToppingDecorator {

    public Cheese(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        this.description = this.pizzaComponent.getDescription() + ", cheese";
    }

    @Override
    public int getCost() {
        return 130 + this.pizzaComponent.getCost();
    }
}
