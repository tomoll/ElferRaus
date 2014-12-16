package de.htwg.elferraus.entities;

import java.math.BigDecimal;
import java.util.Random;
import static java.math.BigDecimal.ZERO;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */
public class MainStack {

    private int count = 0;
    private String colour = "";
    private final int anzFarben = 4;
    private final int anzKartenproFarbe = 20;
    private final int gesamtKarten = anzFarben * anzKartenproFarbe;
    private Card[] startstack = new Card[gesamtKarten];

    //kein Array sondern Stack
    //am besten eigenen Zähler wegen Array 0 quasi 1!!!
    public MainStack() {
        for (int j = 0; j < anzFarben; j++) {
            switch (j) {
                case 0:
                    colour = "y";
                    break;
                case 1:
                    colour = "g";
                    break;
                case 2:
                    colour = "r";
                    break;
                case 3:
                    colour = "b";
                    break;
            }

            for (int i = 0; i < anzKartenproFarbe; i++) {
                startstack[count] = new Card(i + 1, colour);
                count++;
            }

        }
        this.mixCards();

    }

    public int getAmount() {
        return (count);
    }

    public Card popCard() {
        count--;
        return startstack[count];
    }

    public void mixCards() {
        Random rnd = new Random();
        for (int i = startstack.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card a = startstack[index];
            startstack[index] = startstack[i];
            startstack[i] = a;
        }
    }

}
