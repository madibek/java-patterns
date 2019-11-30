package kz.malgara.decorator.dodopizza;

public class ThinkDodoPizza extends Pizza{

    public ThinkDodoPizza() {
        this.description = "Think Dodo Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
