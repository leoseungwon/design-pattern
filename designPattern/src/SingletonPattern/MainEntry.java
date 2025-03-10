package SingletonPattern;

public class MainEntry {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        singleton.doSomething();
    }
}
