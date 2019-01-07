package me.decorator;

public class Espresso extends ABeverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
