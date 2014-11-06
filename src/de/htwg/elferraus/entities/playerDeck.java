package de.htwg.elferraus.entities;

public class playerDeck {
    private int size;
    private int[] hans = new int[80];
    private card[] deck = new card[80];
    
    public playerDeck(int size) {
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public boolean contains (card c){
        for(int i = 0; i<this.size; i++)    
            if(c.getColour().equals(deck[i].getColour()) && c.getNumber() == (deck[i].getNumber())) {
                return true;
            }
        return false;
    }
}

