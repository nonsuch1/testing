package com.nonsuch1.weather;

public class WeatherData {
    public Float getTemperature() { return null;}

    public Float getHumidity() { return null;}

    public Float getPressure() { return null;}

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

    }
}
