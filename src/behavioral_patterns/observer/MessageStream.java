package behavioral_patterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by imKrish on 15/10/16.
 */
public class MessageStream extends Subject {

    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        notifyObservers();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
