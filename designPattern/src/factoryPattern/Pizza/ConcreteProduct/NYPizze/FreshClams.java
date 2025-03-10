package factoryPattern.Pizza.ConcreteProduct.NYPizze;

import factoryPattern.Pizza.Product.Clams;

public class FreshClams implements Clams {
    @Override
    public String getName() {
        return "Fresh Clams";
    }
}
