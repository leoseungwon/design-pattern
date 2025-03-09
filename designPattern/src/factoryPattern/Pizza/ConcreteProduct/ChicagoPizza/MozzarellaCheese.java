package factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;

import factoryPattern.Pizza.Product.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella Cheese";
    }
}
