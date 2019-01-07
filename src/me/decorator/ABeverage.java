package me.decorator;

public abstract class ABeverage {
    String description = "Default beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
