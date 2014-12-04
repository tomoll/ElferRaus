package de.htwg.elferraus.entities;

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
                default:
                    break;
            }

            for (int i = 0; i < anzKartenproFarbe; i++) {
                startstack[count] = new Card(i + 1, colour);
                count++;
            }

        }

    }

    public int getAmount() {
        return (count);
    }

    public Card popCard() {
        count--;
        return startstack[count];
    }

    public void mixCards() {
        Card[] temp = startstack;

        //for (int i = gesamtKarten; i > 0;) {
          //  int j = randomGenerator(0, i);
            //if(startstack[j]==null){
              //  startstack[j] = temp[i];
                //i--;
            //}

        //}
    }
/*
    private static int randomGenerator(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }
*/
}
