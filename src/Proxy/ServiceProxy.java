package Proxy;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ServiceProxy extends Service{

    @Override
    public void doingSomething() {
        Instant start = Instant.now();
        System.out.println("method started");

        super.doingSomething();

        System.out.println("method done");
        Instant end = Instant.now();

        System.out.println("work done in " + start.until(end, ChronoUnit.MILLIS) + " milliseconds");
    }
}
