import observer.CurrentConditionDisplay;
import observer.ForeCastDisplay;
import subject.Subject;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome to the Observer Pattern");
        Subject subject = new Subject();
        new CurrentConditionDisplay(subject);
        new ForeCastDisplay(subject);
        subject.setMeasurements(123.45f, 23.90f,45.36f);

        Thread.sleep(1000);

        System.out.println("New data incoming");
        subject.setMeasurements(23.89f, 40.50f, 700.50f);

    }
}
