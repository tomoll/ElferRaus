package de.htwg.elferraus.entities;

import de.htwg.elferraus.entities.impl.Player;

public interface IStates {

    public int next(Player player, int index, int amount);

}
