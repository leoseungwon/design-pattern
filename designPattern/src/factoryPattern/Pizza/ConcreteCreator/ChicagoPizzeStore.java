package factoryPattern.Pizza.ConcreteCreator;

import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza.ChicagoPizza;
import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza.FrozenClams;
import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza.MozzarellaCheese;
import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza.PlumTomatoSauce;
import factoryPattern.Pizza.ConcreteProduct.ChicagoPizza.ThinCrustDough;
import factoryPattern.Pizza.Creator.PizzaStore;
import factoryPattern.Pizza.Product.Pizza;

public class ChicagoPizzeStore extends PizzaStore {
    
    @Override
    public Pizza createPizza() {
        return new ChicagoPizza(new ThinCrustDough(), new PlumTomatoSauce(), new MozzarellaCheese(), new FrozenClams());
    }
}
