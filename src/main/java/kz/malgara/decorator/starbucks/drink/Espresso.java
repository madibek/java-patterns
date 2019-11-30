package kz.malgara.decorator.starbucks.drink;

public class Espresso extends DrinkComponent {

    public Espresso() {
        this.description = "This is an Espresso";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
