package kz.malgara.decorator.starbucks.condiment;

import kz.malgara.decorator.starbucks.drink.DrinkComponent;

public class Milk extends CondimentDecorator {

    public Milk(DrinkComponent drink) {
        this.drink = drink;
        this.description = this.drink.getDescription() + ", milk";
    }

    @Override
    public int getCost() {
        return 100 + this.drink.getCost();
    }
}
