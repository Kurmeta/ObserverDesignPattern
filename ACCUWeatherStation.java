// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line imports the java.beans.PropertyChangeListener and java.beans.PropertyChangeSupport classes.
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// This line declares a class named "ACCUWeatherStation".
public class ACCUWeatherStation {
    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;

    // This line declares a private PropertyChangeSupport variable named "support" for managing property change listeners.
    private PropertyChangeSupport support;

    // This constructor initializes the "support" variable with a new instance of PropertyChangeSupport.
    public ACCUWeatherStation() {
        support = new PropertyChangeSupport(this);
    }

    // This method adds a property change listener to the list of listeners.
    public void addPropertyChangeListener(PropertyChangeListener accu) {
        support.addPropertyChangeListener(accu);
    }

    // This method removes a property change listener from the list of listeners.
    public void removePropertyChangeListener(PropertyChangeListener accu) {
        support.removePropertyChangeListener(accu);
    }

    // This method sets the weather forecast, notifies property change listeners, and updates the forecast value.
    public void setForecast(String value) {
        // Notifies property change listeners that the "Forecast" property is about to change.
        support.firePropertyChange("Forecast", this.Forecast, value);
        
        // Updates the forecast value.
        this.Forecast = value;
    }
}

