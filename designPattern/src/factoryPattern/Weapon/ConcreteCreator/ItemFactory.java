package factoryPattern;

import java.util.HashMap;

public class ItemFactory extends Factory {

    private final HashMap<String,ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<String,ItemData>();

        repository.put("sword",new ItemData(3));
        repository.put("shield",new ItemData(3));
        repository.put("bow",new ItemData(3));

    }

    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);
        if (itemData == null) {
            System.out.println("알 수 없는 아이템입니다");
            return false;
        }
        if (itemData.getCurrentCount() >= itemData.getMaxCount()) {
            System.out.println("품절아이템입니다");
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String name) {
        if(name=="sword"){return new Sword();}
        if(name=="shield"){return new Shield();}
        if(name=="bow"){return new Bow();}
        return null;
    }

    @Override
    public void postProcessItem(String name) {
        ItemData itemData = repository.get(name);
        itemData.increaseCount();
    }
}
