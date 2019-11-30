package kz.malgara.decorator.Cafe.drink;

public class Latte extends Drink {

    public Latte() {
        this.description = "This is a Latte";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
