package Proxy;

public class Service {
    public void doingSomething(){
        System.out.println("doingSomething");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}