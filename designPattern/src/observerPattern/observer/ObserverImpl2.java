package observerPattern.observer;

public class ObserverImpl2 implements Observer {

    @Override
    public void update() {
        System.out.println("옵저버 2번이라고 합니다, 잘부탁드립니다");
    }

}
