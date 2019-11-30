package kz.malgara.decorator.starbucks.drink;

public class Latte extends DrinkComponent {

    public Latte() {
        this.description = "This is a Latte";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
