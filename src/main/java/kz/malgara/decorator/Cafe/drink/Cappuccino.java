package kz.malgara.decorator.Cafe.drink;

public class Cappuccino extends Drink {

    public Cappuccino() {
        this.description = "This is a Cappuccino";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
