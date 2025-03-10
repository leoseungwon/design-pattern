package factoryPattern.Weapon.ConcreteProduct;

import factoryPattern.Weapon.Product.Item;

public class Shield implements Item {

    @Override
    public void use() {
        System.out.println("방패를 얻었따!");
    }
}
