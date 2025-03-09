package factoryPattern.Pizza.ConcreteCreator;

import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;
import factoryPattern.Pizza.Creator.PizzaStore;
import factoryPattern.Pizza.Product.Pizza;

public class ChicagoPizzeStore extends PizzaStore {
    
    @Override
    public Pizza createPizza() {
        return new ChicagoPizza();
    }
}
