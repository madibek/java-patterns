package kz.malgara.decorator;

import kz.malgara.decorator.Cafe.condiment.WithMilk;
import kz.malgara.decorator.Cafe.condiment.WithSirop;
import kz.malgara.decorator.Cafe.drink.Americano;
import kz.malgara.decorator.Cafe.drink.Cappuccino;
import kz.malgara.decorator.Cafe.drink.Drink;
import kz.malgara.decorator.Cafe.drink.Espresso;
import kz.malgara.decorator.dodopizza.Pizza;
import kz.malgara.decorator.dodopizza.ThickDodoPizza;
import kz.malgara.decorator.dodopizza.ThinkDodoPizza;
import kz.malgara.decorator.dodopizza.topping.Cheese;
import kz.malgara.decorator.dodopizza.topping.Olives;
import kz.malgara.decorator.dodopizza.topping.Pepper;

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

        print(americano);
        print(cappuccino);
        print(espresso);
        System.out.println("\n");

        // Thin Dodo (300 + 110)
        Pizza thinDodo = new ThinkDodoPizza();
        thinDodo = new Olives(thinDodo);
        // Thick Dodo (500 + 50 + 130)
        Pizza thickDodo = new ThickDodoPizza();
        thickDodo = new Pepper(thickDodo);
        thickDodo = new Cheese(thickDodo);
        print(thinDodo);
        print(thickDodo);
    }

    private static void print(Drink espresso) {
        System.out.println("Drink: " + espresso.getDescription() + "; price: " + espresso.getCost());
    }

    private static void print(Pizza pizza) {
        System.out.println("Pizza: " + pizza.getDescription() + "; price: " + pizza.getCost());
    }
}
