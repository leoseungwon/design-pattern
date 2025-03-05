package decoratorPattern.Beverage.Client;

import decoratorPattern.Beverage.Component.Beverage;
import decoratorPattern.Beverage.Concrete.Decaf;
import decoratorPattern.Beverage.Decorator.*;

public class Client {
    public static void main(String[] args) {


        CondimentDecorator coffe = new Milk(new Mocha(new Soy(new Decaf())));
        String coffee = coffe.getDescription();

        System.out.println(coffee);


    }
}
