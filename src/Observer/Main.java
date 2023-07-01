package Observer;

public class Main {

    public static void main(String[] args) {
        MarketSubscriber subscriber1 = new MarketSubscriber("subscriber1");
        MarketSubscriber subscriber2 = new MarketSubscriber("subscriber2");
        MarketSubscriber subscriber3 = new MarketSubscriber("subscriber3");
        MarketSubscriber subscriber4 = new MarketSubscriber("subscriber4");
        MarketSubscriber subscriber5 = new MarketSubscriber("subscriber5");


        MarketObservable observable = new MarketObservable();

        observable.register(subscriber1);
        observable.register(subscriber2);
        observable.register(subscriber3);
        observable.register(subscriber4);
        observable.register(subscriber5);

        observable.notifySubscribers();

        observable.unRegister(subscriber1);
        observable.unRegister(subscriber5);

        System.out.println();

        observable.notifySubscribers();



    }
}