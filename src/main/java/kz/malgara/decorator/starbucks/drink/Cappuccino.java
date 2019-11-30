package kz.malgara.decorator.starbucks.drink;

public class Cappuccino extends DrinkComponent {

    public Cappuccino() {
        this.description = "This is a Cappuccino";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
