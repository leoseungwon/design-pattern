package decoratorPattern.Beverage.Decorator;

import decoratorPattern.Beverage.Component.Beverage;

public class Mocha extends CondimentDecorator{

    private String condi = "Mocha+";

    public Mocha(Beverage beverage) {
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
