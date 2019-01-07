package headfirst.designpatterns.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown ABeverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
