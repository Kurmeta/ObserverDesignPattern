// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line declares a class named "METWeatherApp" that implements the "App" interface.
public class METWeatherApp implements App {

    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;

    // This method implements the "update" method from the "App" interface.
    // It sets the forecast based on the provided Object parameter (casted to String).
    @Override
    public void update(Object Forecast) {
        this.setForecast((String) Forecast);
    }

    // This method returns the current weather forecast.
    public String getForecast() {
        return Forecast;
    }

    // This method sets the weather forecast.
    public void setForecast(String Forecast) {
        this.Forecast = Forecast;
    }

}
