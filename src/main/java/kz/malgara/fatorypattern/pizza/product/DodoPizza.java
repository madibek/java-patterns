package kz.malgara.fatorypattern.pizza.product;

public class DodoPizza extends Pizza {

    public DodoPizza() {
        this.name = "DODO Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.name);
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + this.name);
    }
}
