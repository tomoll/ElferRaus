package de.htwg.elferraus.controller;

import com.google.inject.Injector;
import de.htwg.util.observer.IObservable;
/**
 *
 * @author Tobi
 */
public interface IElferRausController extends IObservable {

    /**
     *
     */
    void create();

    /**
     *
     */
    void startGame();
    /**
     *
     * @return
     */
    boolean next();

    /**
     *
     * @return
     */
    boolean setEndRound();

    /**
     *
     * @param next
     * @return
     */
    boolean setCardRequest(int next);

    /**
     *
     * @return
     */
    boolean getCardRequest();

    /**
     *
     * @return
     */
    String getMainString();

    /**
     *
     * @return
     */
    String getStatusMessage();
    
    void setInjector(Injector injector);
    void setPlayer(int playerAmount);

}
