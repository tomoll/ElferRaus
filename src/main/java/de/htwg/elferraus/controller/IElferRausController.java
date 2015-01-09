package de.htwg.elferraus.controller;

public interface IElferRausController {

    boolean next();

    boolean setEndRound();

    boolean setCardRequest(int next);

    boolean getCardRequest();

    String getMainString();

    String getStatusMessage();
}
