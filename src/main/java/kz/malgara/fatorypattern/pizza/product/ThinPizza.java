package kz.malgara.fatorypattern.pizza.product;

public class ThinPizza extends Pizza {

    public ThinPizza() {
        this.name = "Thin Italiano Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }
}
