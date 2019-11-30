package kz.malgara.decorator.Cafe.drink;

public abstract class Drink {

    protected String description;

    public abstract int getCost();

    public String getDescription() {
        return description;
    }

}
