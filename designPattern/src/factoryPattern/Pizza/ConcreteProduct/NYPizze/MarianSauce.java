package factoryPattern.Pizza.ConcreteProduct.NYPizze;

import factoryPattern.Pizza.Product.Sauce;

public class MarianSauce implements Sauce{
    @Override
    public String getName() {
        return "Marian Sauce";
    }
}
