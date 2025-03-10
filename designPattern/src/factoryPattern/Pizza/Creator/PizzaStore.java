package factoryPattern.Pizza.Creator;

import factoryPattern.Pizza.Product.Pizza;

public abstract class PizzaStore {
    
    public void order() {
        Pizza pizza;
       pizza = createPizza();
       pizza.whatPizza();
    }
    
    public abstract Pizza createPizza();
}
