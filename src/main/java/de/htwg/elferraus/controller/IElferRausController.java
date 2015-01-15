package de.htwg.elferraus.controller;

import com.google.inject.Injector;
import de.htwg.elferraus.entities.impl.Player;
import de.htwg.util.observer.IObservable;

/**
 *
 * @author Tobi
 */
public interface IElferRausController extends IObservable {

    /**
     * Create Method the Startsequence for the Player
     */
    void create();

    /**
     * to start the game with the first Player
     */
    void startGame();

    /**
     *  To Continue the Game to the next Player
     * @return
     */
    boolean next();

    /**
     *  if the player wants to end the round
     * @return
     */
    boolean setEndRound();

    /**
     * if the player want to set a card to the table
     * @param next
     * @return
     */
    boolean setCardRequest(int next);

    /**
     * if the player needs a card from the stack
     * @return
     */
    boolean getCardRequest();

    /**
     * the mainstring with all options for tui
     * @return
     */
    String getMainString();

    /**
     *to set the statusmessage
     * @return
     */
    String getStatusMessage();

    /**
     *for setting the injector at start
     * @param injector
     */
    void setInjector(Injector injector);

    /**
     *for getting the actual player
     * @return
     */
    Player getActualPlayer();

    /**
     *to set at beginning how many players want to play
     * @param playerAmount
     */
    void setPlayer(int playerAmount);

    /**
     *to get the number of how many players are in the game
     * @return
     */
    int getIntPlayer();

}
