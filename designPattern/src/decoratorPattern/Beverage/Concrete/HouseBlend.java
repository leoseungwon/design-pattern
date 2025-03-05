package decoratorPattern.Beverage.Concrete;

import decoratorPattern.Beverage.Component.Beverage;

public class HouseBlend implements Beverage{
    private final String des = "핸드드립+";

    public String getDescription() {
        return des;
    }
    
}
