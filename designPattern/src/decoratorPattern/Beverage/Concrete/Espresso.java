package decoratorPattern.Beverage.Concrete;

import decoratorPattern.Beverage.Component.Beverage;

public class Espresso implements Beverage{
    private final String des = "에스프레소+";

    public String getDescription() {
        return des;
    }
}
