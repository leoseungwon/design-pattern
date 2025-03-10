package decoratorPattern.Beverage.Decorator;

import decoratorPattern.Beverage.Component.Beverage;

public class Soy extends CondimentDecorator{
    private String condi = "Soy+";

    public Soy(Beverage beverage) {
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
