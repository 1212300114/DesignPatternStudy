import me.decorator.*;

public class Main {
    public static void main(String[] args) {
//        ADuck d = new MallardDuck();
//        d.display();
//        d.performFly();
//        d.performQuack();
//        WeatherData data = new WeatherData();
//        IDisplayElement displayElement = new ConditionsDisplay(data);
//        data.setMeasurements(100, 100, 10);
//        WeatherData data = new WeatherData();
//        GeneralDisplay display = new GeneralDisplay(data);
//        data.setMeasurements(100, 10, 10);

        ABeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        ABeverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1); // add  two mocha
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + (float) beverage1.cost());
        System.out.println((float) beverage1.cost() == 1.39 );
    }
}