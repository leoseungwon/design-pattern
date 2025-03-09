package factoryPattern.Pizza.Creator;

import factoryPattern.Pizza.Product.Pizza;

public abstract class PizzaStore {
    
    public void order() {
        Pizza pizza;
        pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    
    public abstract Pizza createPizza();
}
