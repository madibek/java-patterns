package kz.malgara.decorator.dodopizza;

public abstract class Pizza {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract int getCost();
}
