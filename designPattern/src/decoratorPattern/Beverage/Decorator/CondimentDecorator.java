package decoratorPattern.Beverage.Decorator;

import decoratorPattern.Beverage.Component.Beverage;

public abstract class CondimentDecorator implements Beverage{
    private final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;

    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    abstract String getCondiment();
}
