package factoryPattern.Pizza.ConcreteProduct;

import factoryPattern.Pizza.Product.Pizza;

public class NYPizza implements Pizza{

    private final String name = "NY Pizza";
    private final String dough = "NY dough";
    private final String sauce = "NY sauce";
    private final String cheese = "NY cheese";

    public NYPizza() {
       
    }

    @Override
    public void bake() {
        System.out.println("NY bake");
    }

    @Override
    public void box() {
        System.out.println("NY box");
    }

    @Override
    public void cut() {
        System.out.println("NY cut");
    }

    @Override
    public void prepare() {
        System.out.println("NY prepare");
    }

}
