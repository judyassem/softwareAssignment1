package ObserverPackage;
import java.util.ArrayList;
import java.util.List;
// Order Subject Class implementing Subject Interface
public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void myNotify() {
        System.out.println("\nOrder placed successfully!");
        notifyObservers();
    }

}
