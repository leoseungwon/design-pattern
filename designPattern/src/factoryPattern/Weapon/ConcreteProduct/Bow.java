package factoryPattern.Weapon.ConcreteProduct;

import factoryPattern.Weapon.Product.Item;

public class Bow implements Item{
    @Override
    public void use() {
        System.out.println("활을 얻었따!");
    }
}
