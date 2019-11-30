package kz.malgara.decorator;

import kz.malgara.decorator.condiment.WithMilk;
import kz.malgara.decorator.condiment.WithSirop;
import kz.malgara.decorator.drink.Americano;
import kz.malgara.decorator.drink.Cappuccino;
import kz.malgara.decorator.drink.Drink;
import kz.malgara.decorator.drink.Espresso;

public class Client {

    /**
     *
     * The decorator pattern is used to extend
     * or alter the functionality of objects at
     * run-time by wrapping them in an object of
     * a decorator class. This provides a flexible
     * alternative to using inheritance to modify behaviour.
     *
     * */
    public static void main(String[] args) {

        // America (350)
        Drink americano = new Americano();
        // Cappuccino with milk (500 + 100)
        // and double sirop (+ 50 + 50)
        Drink cappuccino = new Cappuccino();
        cappuccino = new WithMilk(cappuccino);
        cappuccino = new WithSirop(cappuccino);
        cappuccino = new WithSirop(cappuccino);
        // Espresso with milk (250 + 100)
        Drink espresso = new Espresso();
        espresso = new WithMilk(espresso);

        System.out.println("Drink: " + americano.getDescription() + "; price: " + americano.getCost());
        System.out.println("Drink: " + cappuccino.getDescription() + "; price: " + cappuccino.getCost());
        System.out.println("Drink: " + espresso.getDescription() + "; price: " + espresso.getCost());
    }
}
