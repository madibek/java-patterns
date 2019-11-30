package kz.malgara.decorator.starbucks.drink;

public abstract class DrinkComponent {

    protected String description;

    public abstract int getCost();

    public String getDescription() {
        return description;
    }

}
