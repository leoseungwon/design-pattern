package factoryPattern.Pizza.ConcreteProduct.ChicagoPizza;

import factoryPattern.Pizza.Product.Sauce;

public class PlumTomatoSauce implements Sauce {
    @Override
    public String getName() {
        return "Plum Tomato Sauce";
    }
}
