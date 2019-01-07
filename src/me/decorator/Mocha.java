package me.decorator;

public class Mocha extends ACondimentDecorator {
    ABeverage beverage;

    public Mocha(ABeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
