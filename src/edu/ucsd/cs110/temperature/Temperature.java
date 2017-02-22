package edu.ucsd.cs110.temperature;

/**
 * Created by evang on 2/15/2017.
 */
public abstract class Temperature {
    float value;
    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}
