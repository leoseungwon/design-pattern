package SingletonPattern;

public enum Singleton {
    UNIQUE_INSTANCE;
    
    public void doSomething() {
        System.out.println("Singleton doSomething");
    }
}
