package FacadePattern;

public class MainEntry {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.run("John");
        facade.run("Jane");
        facade.run("Jim");
        facade.run("Jill");
    }
}
