package kz.malgara.fatorypattern.product;

public class CheesePizza extends Pizza {

    public CheesePizza(String name) {
        this.name = name;
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
