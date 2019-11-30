package kz.malgara.decorator.starbucks.drink;

public class Americano extends DrinkComponent {

    public Americano() {
        this.description = "This is an Americano";
    }

    @Override
    public int getCost() {
        return 350;
    }
}
