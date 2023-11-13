// This line declares a package named "com.baeldung.observer".
package com.baeldung.observer;

// This line imports necessary classes from the java.util package.
import java.util.ArrayList;
import java.util.List;

// This line declares a class named "METWeatherStation".
public class METWeatherStation {
    // This line declares a private String variable named "Forecast" to store the weather forecast.
    private String Forecast;
    
    // This line declares a private List variable named "App" to store a list of observers (objects of the App class).
    private List<App> App = new ArrayList<>();

    // This method adds an observer (App object) to the list of observers.
    public void addObserver(App App) {
        this.App.add(App);
    }

    // This method removes an observer (App object) from the list of observers.
    public void removeObserver(App App) {
        this.App.remove(App);
    }

    // This method sets the weather forecast and notifies all observers by calling their update method.
    public void setForecast(String Forecast) {
        this.Forecast = Forecast;
        
        // Iterates through the list of observers and updates each one with the new forecast.
        for (App App : this.App) {
            App.update(this.Forecast);
        }
    }
}
