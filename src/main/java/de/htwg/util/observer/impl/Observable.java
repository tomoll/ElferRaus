package de.htwg.util.observer.impl;

import de.htwg.util.observer.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tobi
 */
public class Observable {

    private final List<IObserver> subscribers = new ArrayList<IObserver>();

    /**
     *
     * @param s
     */
    public final void addObserver(final IObserver s) {
            subscribers.add(s);
    }

    /**
     *
     */
    public final void notifyObservers() {
        for (IObserver observer : subscribers) {
            observer.update();
        }
    }

    /**
     *
     * @param s
     */
    public void removeObserver(IObserver s) {
        subscribers.remove(s);
    }


}
