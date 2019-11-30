package kz.malgara.decorator.drink;

public class Cappuccino extends Drink {

    public Cappuccino() {
        this.description = "This is a Cappuccino";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
