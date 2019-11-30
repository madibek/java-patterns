package kz.malgara.decorator.dodopizza.pizza;

public class ThinkDodoPizzaComponent extends PizzaComponent {

    public ThinkDodoPizzaComponent() {
        this.description = "Think Dodo PizzaComponent";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
