package factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;

import factoryPattern.Pizza.Product.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thin Crust Dough";
    }
}
