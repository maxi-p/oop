package design_patterns.observer.subject.implementation;

import design_patterns.observer.observer.Observer;

public class CurrentConditionDisplay implements Observer {
    private float temperature;
    private float humidity;
    private WeatherStation weatherStation;

    public CurrentConditionDisplay(WeatherStation subject) {
        weatherStation = subject;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
        humidity = weatherStation.getHumidity();
        System.out.println("Current condition is " + temperature + "F degrees celsius" + " and " + humidity + "% humidity");
    }
}
