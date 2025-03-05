package observerPattern.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update() {
        System.out.println("옵저버 1번이라고 합니다, 잘부탁드립니다");
    }
}
