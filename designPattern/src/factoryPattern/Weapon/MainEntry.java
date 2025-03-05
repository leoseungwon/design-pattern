package factoryPattern;

public class MainEntry {
    public static void main(String[] args) {
        ItemFactory factory = new ItemFactory();
        Item shield = factory.create("shield");
        if(shield!=null) shield.use();

        Item shield1 = factory.create("shield");
        if(shield1!=null) shield1.use();

        Item shield2 = factory.create("shield");
        if(shield2!=null) shield2.use();

        Item shield3 = factory.create("shield");
        if(shield3!=null) shield3.use();

        Item shield4 = factory.create("shield");
        if(shield4!=null) shield4.use();


    }
}
