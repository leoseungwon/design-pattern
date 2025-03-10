package factoryPattern.Pizza.ConcreteCreator;

import factoryPattern.Pizza.ConcreteProduct.NYPizze.FreshClams;
import factoryPattern.Pizza.ConcreteProduct.NYPizze.MarianSauce;
import factoryPattern.Pizza.ConcreteProduct.NYPizze.NYPizza;
import factoryPattern.Pizza.ConcreteProduct.NYPizze.ReggianoCheese;
import factoryPattern.Pizza.ConcreteProduct.NYPizze.ThickCrustDough;
import factoryPattern.Pizza.Creator.PizzaStore;
import factoryPattern.Pizza.Product.Pizza;

public class NYPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza() {
        return new NYPizza(new ThickCrustDough(), new MarianSauce(), new ReggianoCheese(), new FreshClams());
    }
}
