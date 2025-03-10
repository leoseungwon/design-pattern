package factoryPattern.Pizza.ConcreteProduct.NYPizze;

import factoryPattern.Pizza.Product.Cheese;
import factoryPattern.Pizza.Product.Clams;
import factoryPattern.Pizza.Product.Dough;
import factoryPattern.Pizza.Product.Pizza;
import factoryPattern.Pizza.Product.Sauce;

public class NYPizza implements Pizza{

    private  String name = "NY Pizza";
    private  Dough dough;
    private  Sauce sauce;
    private  Cheese cheese;
    private  Clams clams;

    public NYPizza(Dough dough, Sauce sauce, Cheese cheese, Clams clams) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.clams = clams;
    }

    @Override
    public void whatPizza() {
        // TODO Auto-generated method stub
        System.out.println("NY Pizza");
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
        System.out.println(cheese.getName());
        System.out.println(clams.getName());
    }

   

}
