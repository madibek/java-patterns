package kz.malgara.decorator.condiment;

import kz.malgara.decorator.drink.Drink;

public class WithMilk extends Drink {

    private Drink drink;

    public WithMilk(Drink drink) {
        this.drink = drink;
        this.description = this.drink.getDescription() + ", milk";
    }

    @Override
    public int getCost() {
        return 100 + this.drink.getCost();
    }
}
