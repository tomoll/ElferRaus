package de.htwg.util.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    private final List<IObserver> subscribers = new ArrayList<IObserver>();

    public final void addObserver(final IObserver s) {
        if (!subscribers.contains(s)) {
            subscribers.add(s);
        }
    }

    public final void notifyObservers() {
        for (IObserver observer : subscribers) {
            observer.update();
        }
    }

    public void removeObserver(IObserver s) {
        subscribers.remove(s);
    }

    public final List<IObserver> getSubscribers() {
        return subscribers;
    }

}
