package observer;

import subject.Subject;

public class ForeCastDisplay implements IObserver, IDisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForeCastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Hi from ForeCast Display!!");
        System.out.println("today's temperature is: " + this.temperature);
        System.out.println("today's humidity is: " + this.humidity);
    }

    @Override
    public void update() {
        this.temperature= weatherData.getTemperature();
        this.humidity=weatherData.getHumidity();
        this.display();
    }
}
