package factoryPattern.Pizza.ConcreteCreator;

import factoryPattern.Pizza.ConcreteProduct.NYPizza;
import factoryPattern.Pizza.Creator.PizzaStore;
import factoryPattern.Pizza.Product.Pizza;

public class NYPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza() {
        return new NYPizza();
    }
}
