package decoratorPattern.Beverage.Decorator;

import decoratorPattern.Beverage.Component.Beverage;

public class Milk extends CondimentDecorator {
    private String condi = "Milk+";

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getCondiment();
    }

    @Override
    String getCondiment() {
        return condi;
    }
}
