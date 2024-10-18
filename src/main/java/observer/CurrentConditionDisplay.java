package observer;

public class CurrentConditionDisplay implements IObserver, IDisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("HI from CurrentConditionDisplay: " );
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
            this.temperature= temperature;
            this.humidity=humidity;
            this.pressure= pressure;
            this.display();
    }
}
