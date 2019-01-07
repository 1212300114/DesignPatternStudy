package me.decorator;

public class HouseBlend extends ABeverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
