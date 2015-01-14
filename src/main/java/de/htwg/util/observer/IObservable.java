/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.util.observer;

/**
 *
 * @author Tobi
 */
public interface IObservable {
    
    void addObserver(final IObserver s);
    
    void notifyObservers();
    
    void removeObserver(IObserver s);
}
