package factoryPattern.Pizza.ConcreteProduct;

import factoryPattern.Pizza.Product.Pizza;

public class ChicagoPizza implements Pizza  {

    private final String name = "Chicago Pizza";
    private final String dough = "Chicago dough";
    private final String sauce = "Chicago sauce";
    private final String cheese = "Chicago cheese";

    public ChicagoPizza() {
       
    }

    @Override
    public void bake() {
        System.out.println("Chicago bake");
    }

    @Override
    public void box() {
        System.out.println("Chicago box");
    }       

    @Override
    public void cut() {
        System.out.println("Chicago cut");
    }   

    @Override
    public void prepare() {
        System.out.println("Chicago prepare");
    }
}
