package decoratorPattern.Beverage.Concrete;

import decoratorPattern.Beverage.Component.Beverage;

public class DarkRoast implements Beverage {

    private final String des = "다크로스트+";

    @Override
    public String getDescription() {
        return des;
    }
}
