package decoratorPattern.Beverage.Concrete;

import decoratorPattern.Beverage.Component.Beverage;

public class Decaf implements Beverage{

    private final String des = "디카페인+";

    public String getDescription() {
        return des;
    }


    
}
