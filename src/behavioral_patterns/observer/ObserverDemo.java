package behavioral_patterns.observer;

/**
 * Created by imKrish on 15/10/16.
 */
public class ObserverDemo {

    public static void main(String args[]) {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message");
        tabletClient.addMessage("Another new message");
    }
}
