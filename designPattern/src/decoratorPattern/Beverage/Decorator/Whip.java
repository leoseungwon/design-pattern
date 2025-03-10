package decoratorPattern.Beverage.Decorator;

import decoratorPattern.Beverage.Component.Beverage;

public class Whip extends CondimentDecorator{

    private String condi = "Whip+";

    public Whip(Beverage beverage) {
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
