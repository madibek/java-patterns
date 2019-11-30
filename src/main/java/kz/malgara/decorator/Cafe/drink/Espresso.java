package kz.malgara.decorator.Cafe.drink;

public class Espresso extends Drink {

    public Espresso() {
        this.description = "This is an Espresso";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
