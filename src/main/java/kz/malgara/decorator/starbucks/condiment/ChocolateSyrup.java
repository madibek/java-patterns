package kz.malgara.decorator.starbucks.condiment;

import kz.malgara.decorator.starbucks.drink.DrinkComponent;

public class ChocolateSyrup extends CondimentDecorator {

    public ChocolateSyrup(DrinkComponent drink) {
        this.drink = drink;
        this.description = this.drink.getDescription() + ", syrup";
    }

    @Override
    public int getCost() {
        return 50 + this.drink.getCost();
    }
}
