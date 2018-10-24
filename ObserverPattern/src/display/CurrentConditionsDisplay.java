package display;

import observer.Observer;
import subject.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float tempreature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + tempreature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempreature = temp;
        this.humidity = humidity;
        display();
    }
}
