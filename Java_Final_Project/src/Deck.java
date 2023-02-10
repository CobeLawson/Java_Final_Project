//import in the List, ArrayList, and Collections Classes for their functionality with manipulating the deck and cards

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    //Initializing field for the List of Cards that will make up the deck
    private List<Card> cards = new ArrayList<Card>();

    //This is the Constructor for the Deck
    public Deck() {
        //This first for-loop sets a variable to determine the suit of the cards we add to our deck
        for(int i = 0; i < 4; i++){
            //This second for-loop sets a new variable to determine the rank or value of the cards we add to our deck
            for(int j = 2; j < 15; j++) {
                StringBuilder tempCardName = new StringBuilder();
                Card tempCard = new Card(j, i, tempCardName);
                cards.add(tempCard);
            }
        }
    }

    //This is the setter for the List of Cards that make up our deck
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    //This is the getter for the List of Cards that make up our deck
    public List<Card> getCards() {
        return cards;
    }

    //This method uses the Collections.shuffle method (which we imported at the start) to shuffle our List of Cards for our deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //This method uses the .remove() method from the List class to draw the first card and remove it from our deck
    public Card draw() {
        return cards.remove(0);
    }
}
