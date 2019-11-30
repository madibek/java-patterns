package kz.malgara.decorator.dodopizza;

public class ThickDodoPizza extends Pizza {
    public ThickDodoPizza() {
        this.description = "Thick Dodo Pizza";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
