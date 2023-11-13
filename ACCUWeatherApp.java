// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line imports the java.beans.PropertyChangeEvent and java.beans.PropertyChangeListener classes.
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// This line declares a class named "ACCUWeatherApp" that implements the PropertyChangeListener interface.
public class ACCUWeatherApp implements PropertyChangeListener {

    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;

    // This method is called when a property of the observed object changes.
    // It updates the weather forecast based on the new value from the PropertyChangeEvent.
    public void propertyChange(PropertyChangeEvent warning) {
        this.setForecast((String) warning.getNewValue());
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

