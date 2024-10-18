import observer.CurrentConditionDisplay;
import observer.IObserver;
import subject.ISubject;
import subject.Subject;

public class Main {

    public static void main(String[] args){
        System.out.println("welcome to the Observer Pattern");
        IObserver currentConditionDisplay = new CurrentConditionDisplay();
        ISubject subject= new Subject(123.45f, 23.90f,45.36f);
        subject.registerObserver(currentConditionDisplay);
        subject.notifyObserver();
    }
}
