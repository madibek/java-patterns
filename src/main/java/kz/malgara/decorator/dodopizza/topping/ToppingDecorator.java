package kz.malgara.decorator.dodopizza.topping;

import kz.malgara.decorator.dodopizza.pizza.PizzaComponent;

abstract class ToppingDecorator extends PizzaComponent {
    PizzaComponent pizzaComponent;
}
