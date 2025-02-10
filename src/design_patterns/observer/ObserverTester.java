package design_patterns.observer;

import design_patterns.observer.observer.Observer;
import design_patterns.observer.subject.Subject;
import design_patterns.observer.subject.implementation.CurrentConditionDisplay;
import design_patterns.observer.subject.implementation.WeatherStation;

public class ObserverTester {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer observer = new CurrentConditionDisplay(weatherStation);
        Observer observer2 = new CurrentConditionDisplay(weatherStation);

        weatherStation.setMeasurements(80, 65, 90);
        weatherStation.setMeasurements(80, 70, 90);



    }
}
