package me.strategy.duck;

public class MallardDuck extends ADuck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a mallard me.observer.weather.duck");
	}
	
}
