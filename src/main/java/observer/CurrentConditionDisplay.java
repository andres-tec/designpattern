package observer;

import subject.ISubject;
import subject.Subject;

public class CurrentConditionDisplay implements IObserver, IDisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weather;


    public CurrentConditionDisplay(ISubject weather) {
        this.weather = (Subject) weather;
        this.weather.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("HI from CurrentConditionDisplay: " );
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
    }

    @Override
    public void update() {
            this.temperature= this.weather.getTemperature();
            this.humidity=this.weather.getHumidity();
            this.pressure= this.weather.getPressure();
            this.display();
    }
}
