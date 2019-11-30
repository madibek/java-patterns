package kz.malgara.decorator;

import kz.malgara.decorator.dodopizza.pizza.PizzaComponent;
import kz.malgara.decorator.dodopizza.pizza.ThickDodoPizzaComponent;
import kz.malgara.decorator.starbucks.condiment.Milk;
import kz.malgara.decorator.starbucks.condiment.ChocolateSyrup;
import kz.malgara.decorator.starbucks.drink.Americano;
import kz.malgara.decorator.starbucks.drink.Cappuccino;
import kz.malgara.decorator.starbucks.drink.DrinkComponent;
import kz.malgara.decorator.starbucks.drink.Espresso;
import kz.malgara.decorator.dodopizza.pizza.ThinkDodoPizzaComponent;
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
        DrinkComponent americano = new Americano();
        // Cappuccino with milk (500 + 100)
        // and double sirop (+ 50 + 50)
        DrinkComponent cappuccino = new Cappuccino();
        cappuccino = new Milk(cappuccino);
        cappuccino = new ChocolateSyrup(cappuccino);
        cappuccino = new ChocolateSyrup(cappuccino);
        // Espresso with milk (250 + 100)
        DrinkComponent espresso = new Espresso();
        espresso = new Milk(espresso);

        print(americano);
        print(cappuccino);
        print(espresso);
        System.out.println("\n");

        // Thin Dodo (300 + 110)
        PizzaComponent thinDodo = new ThinkDodoPizzaComponent();
        thinDodo = new Olives(thinDodo);
        // Thick Dodo (500 + 50 + 130)
        PizzaComponent thickDodo = new ThickDodoPizzaComponent();
        thickDodo = new Pepper(thickDodo);
        thickDodo = new Cheese(thickDodo);
        print(thinDodo);
        print(thickDodo);
    }

    private static void print(DrinkComponent espresso) {
        System.out.println("DrinkComponent: " + espresso.getDescription() + "; price: " + espresso.getCost());
    }

    private static void print(PizzaComponent pizzaComponent) {
        System.out.println("PizzaComponent: " + pizzaComponent.getDescription() + "; price: " + pizzaComponent.getCost());
    }
}
