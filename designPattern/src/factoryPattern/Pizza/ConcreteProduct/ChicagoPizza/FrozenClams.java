package factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;

import factoryPattern.Pizza.Product.Clams;

public class FrozenClams implements Clams {
    @Override
    public String getName() {
        return "Frozen Clams";
    }
}
