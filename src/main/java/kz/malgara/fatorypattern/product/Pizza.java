package kz.malgara.fatorypattern.product;

public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public abstract void cook();

    public String getName() {
        return name;
    }
}
