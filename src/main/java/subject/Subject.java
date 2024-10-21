package subject;

import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private List<IObserver> observerList=new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();
    }
    public Subject(){
    }
    @Override
    public void registerObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer:observerList) {
            observer.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
