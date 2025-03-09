package factoryPattern.Pizza.ConcreteProduct.NYPizze;

import factoryPattern.Pizza.Product.Dough;

public class ThickCrustDough implements Dough{
    @Override
    public String getName() {
        return "Thick Crust Dough";
    }
}
