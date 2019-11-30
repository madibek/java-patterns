package kz.malgara.decorator.dodopizza.pizza;

public abstract class PizzaComponent {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract int getCost();
}
