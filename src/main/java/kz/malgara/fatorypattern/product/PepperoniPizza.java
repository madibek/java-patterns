package kz.malgara.fatorypattern.product;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(String name) {
        this.name = name;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare... " + this.name);
    }

    @Override
    public void cook() {
        System.out.println("Cook... " + this.name);
    }
}
