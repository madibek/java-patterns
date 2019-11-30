package kz.malgara.decorator.starbucks.condiment;

import kz.malgara.decorator.starbucks.drink.DrinkComponent;

abstract class CondimentDecorator extends DrinkComponent {
    DrinkComponent drink;
}
