package me.decorator;

public class Whip extends ABeverage {
    ABeverage beverage;

    public Whip(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
