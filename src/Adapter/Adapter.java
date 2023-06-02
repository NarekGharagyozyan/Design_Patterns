package Adapter;

public class Adapter implements Sensor{
    private FahrenheitSensor fahrenheitSensor;

    public Adapter(FahrenheitSensor fahrenheitSensor){
        this.fahrenheitSensor = fahrenheitSensor;
    }
    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemp() - 32) * 5.0 / 9.0;
    }
}
