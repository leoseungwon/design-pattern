package factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;

import factoryPattern.Pizza.Product.Cheese;
import factoryPattern.Pizza.Product.Clams;
import factoryPattern.Pizza.Product.Dough;
import factoryPattern.Pizza.Product.Pizza;
import factoryPattern.Pizza.Product.Sauce;

public class ChicagoPizza implements Pizza  {

    private  String name = "Chicago Pizza";
    private  Dough dough;
    private  Sauce sauce;
    private  Cheese cheese;
    private  Clams clams;

    public ChicagoPizza(Dough dough, Sauce sauce, Cheese cheese, Clams clams) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.clams = clams;
    }

    @Override
    public void whatPizza() {
        // TODO Auto-generated method stub
        System.out.println("Chicago Pizza");
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
        System.out.println(clams.getName());
    }
}
