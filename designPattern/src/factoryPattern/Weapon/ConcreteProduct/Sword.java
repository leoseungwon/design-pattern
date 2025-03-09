package factoryPattern.Weapon.ConcreteProduct;

import factoryPattern.Weapon.Product.Item;

public class Sword implements Item {

    @Override
    public void use() {
        System.out.println("칼을 얻었따!!");
    }
}
