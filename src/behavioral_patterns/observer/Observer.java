package behavioral_patterns.observer;

/**
 * Created by imKrish on 15/10/16.
 */
public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
