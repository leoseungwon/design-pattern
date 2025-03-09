package factoryPattern.Weapon.Creator;

import factoryPattern.Weapon.Product.Item;

public abstract class Factory {
    public Item create(String name) {
        boolean isCreatable = this.isCreatable(name);
        if(isCreatable){
            Item item = this.createItem(name);
            postProcessItem(name);
            return item;
        }
        return null;
    }

    public abstract boolean isCreatable(String name);
    public abstract Item createItem(String name);
    public abstract void postProcessItem(String name);
}
