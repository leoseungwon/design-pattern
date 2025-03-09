package factoryPattern.Pizza.ConcreteProduct.NYPizze;

import factoryPattern.Pizza.Product.Cheese;

public class ReggianoCheese implements Cheese{
    @Override
    public String getName() {
        return "Reggiano Cheese";
    }
}
