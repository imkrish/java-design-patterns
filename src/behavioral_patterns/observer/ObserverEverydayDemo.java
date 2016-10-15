package behavioral_patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imKrish on 15/10/16.
 */
public class ObserverEverydayDemo {

    public static void main(String args[]) {

        TwitterStream twitterStream = new TwitterStream();

        Client client1 = new Client("Krish");
        Client client2 = new Client("Bob");

        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);

        twitterStream.someoneTweeted();
        twitterStream.someoneTweeted();
    }
}

// Concrete subject
class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers("send message to observers");
    }
}

// Concrete observer
class Client implements Observer {

    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}