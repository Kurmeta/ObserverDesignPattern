// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line imports the java.util.Observable class, which is part of the Java built-in Observer pattern.
import java.util.Observable;

// This line declares a class named "BBCWeatherStation" that extends the Observable class.
public class BBCWeatherStation extends Observable {
    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;

    // This method sets the weather forecast, marks the object as changed, and notifies observers.
    public void setForecast(String Forecast) {
        // Sets the forecast to the provided value.
        this.Forecast = Forecast;
        
        // Marks the object as changed, which is necessary for the notifyObservers method.
        setChanged();
        
        // Notifies all registered observers with the updated forecast.
        notifyObservers(Forecast);
    }
}
