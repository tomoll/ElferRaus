package de.htwg.elferraus.controller;

public interface IElferRausController {
    public boolean next();
    public boolean setEndRound();
    public boolean setCardRequest(int next);
    public boolean getCardRequest();
    public String getMainString();
    public String getStatusMessage();
}
