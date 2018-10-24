import display.CurrentConditionsDisplay;
import display.HeatIndexDisplay;
import subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {

//        Observable

        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        currentConditionsDisplay.update();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
