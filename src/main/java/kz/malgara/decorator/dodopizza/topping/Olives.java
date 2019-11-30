package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.pizza.PizzaComponent;

public class Olives extends ToppingDecorator {

    public Olives(PizzaComponent pizzaComponent) {
        this.pizzaComponent = pizzaComponent;
        this.description = this.pizzaComponent.getDescription() + ", olives";
    }

    @Override
    public int getCost() {
        return 110 + this.pizzaComponent.getCost();
    }
}
