package Adapter;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Adapter(new FahrenheitSensor());

        System.out.println(sensor.getTemperature());
    }
}
