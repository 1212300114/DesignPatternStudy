package me.factory.pizza;

import java.util.ArrayList;

public abstract class APizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();

	void prepare() {
		System.out.println("Prepare  " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official APizzaStore box");
	}

	public String getName() {
		return name;
	}
}
