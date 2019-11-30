package kz.malgara.decorator.drink;

public class Americano extends Drink {

    public Americano() {
        this.description = "This is an Americano";
    }

    @Override
    public int getCost() {
        return 350;
    }
}
