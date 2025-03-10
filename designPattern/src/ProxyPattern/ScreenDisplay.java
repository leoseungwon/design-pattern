package ProxyPattern;

public class ScreenDisplay implements Dispaly {

    @Override
    public void printf(String content) {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(content);
    }

}
