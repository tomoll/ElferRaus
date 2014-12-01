package de.htwg.elferraus.entities;

/**
 *
 * @author Christian Hümmer, Tobias Moll
 */

public class MainStack {
    private Card[] startstack = new Card[80];
    int count=0;
    String colour = "";
    //kein Array sondern Stack
    //am besten eigenen Zähler wegen Array 0 quasi 1!!!
    public MainStack() {
        for (int j=0; j < 4; j++){
            switch(j){
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
        
            for (int i=0; i < 20; i++){
                startstack[count] = new Card(i+1, colour);
                count++;
            }
            
        }
     
    }
    
    public int getAmount(){
        return (count);
    }
    
    public Card popCard(){
        count--;
        return startstack[count];
    }


}
