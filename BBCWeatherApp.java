// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line imports the java.util.Observable and java.util.Observer classes.
import java.util.Observable;
import java.util.Observer;

// This line declares a class named "BBCWeatherApp" that implements the Observer interface.
public class BBCWeatherApp implements Observer {

    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;

    // This method is called when the observed object (Observable) is changed.
    // It updates the weather forecast based on the provided Object parameter (casted to String).
    @Override
    public void update(Observable o, Object Forecast) {
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
