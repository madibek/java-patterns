package kz.malgara.decorator.dodopizza.pizza;

public class ThickDodoPizzaComponent extends PizzaComponent {
    public ThickDodoPizzaComponent() {
        this.description = "Thick Dodo PizzaComponent";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
