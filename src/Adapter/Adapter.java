package Adapter;

public class Adapter implements Sensor{
    private FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemp() - 32) * 5.0 / 9.0;
    }
}
