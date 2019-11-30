package kz.malgara.decorator.condiment;

import kz.malgara.decorator.drink.Drink;

public class WithSirop extends Drink {

    private Drink drink;

    public WithSirop(Drink drink) {
        this.drink = drink;
        this.description = this.drink.getDescription() + ", sirop";
    }

    @Override
    public int getCost() {
        return 50 + this.drink.getCost();
    }
}
