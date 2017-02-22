package edu.ucsd.cs110.temperature;

/**
 * Created by evang on 2/15/2017.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float) (((this.getValue()) - 32) * 0.5555555555556));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return this.getValue() + " F";
    }
}
