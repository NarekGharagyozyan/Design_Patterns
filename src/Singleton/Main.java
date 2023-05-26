package Singleton;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Singleton s1 = Singleton.getSingleton();
            System.out.println("end of thread1 : " + s1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            Singleton s2 = Singleton.getSingleton();
            System.out.println("end of thread2 : " + s2.hashCode());
        });

        Thread thread3 = new Thread(() -> {
            Singleton s3 = Singleton.getSingleton();
            System.out.println("end of thread3 : " + s3.hashCode());
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}