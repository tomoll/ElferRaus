package de.htwg.elferraus.entities.impl;

import de.htwg.elferraus.entities.ICard;
import de.htwg.elferraus.entities.IMainStack;
import java.util.Random;

public class MainStack implements IMainStack {

    private int count = 0;
    private String colour = "";
    private static final int ANZFARBEN = 4;
    private static final int ANZKARTENPROFARBE = 20;
    private static final int gesamtKarten = ANZFARBEN * ANZKARTENPROFARBE;
    private ICard[] startstack = new ICard[gesamtKarten];
    private static final int THREE = 3;

    public MainStack(boolean mixing) {
        for (int j = 0; j < ANZFARBEN; j++) {
            if (j == 0) {
                colour = "y";
            }
            if (j == 1) {
                colour = "g";
            }
            if (j == 2) {
                colour = "r";
            }
            if (j == THREE) {
                colour = "b";
            }

            for (int i = 0; i < ANZKARTENPROFARBE; i++) {
                startstack[count] = new Card(i + 1, colour);
                count++;
            }

        }
        if (mixing) {
            this.mixCards();
        }

    }

    public int getAmount() {
        return (count);
    }

    public ICard popCard() {
        count--;
        return startstack[count];
    }

    private void mixCards() {
        Random rnd = new Random();
        for (int i = startstack.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            ICard a = startstack[index];
            startstack[index] = startstack[i];
            startstack[i] = a;
        }
    }

}
