package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imKrish on 15/10/16.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detatch(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
