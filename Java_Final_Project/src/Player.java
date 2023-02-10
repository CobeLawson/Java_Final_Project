//import in the List and ArrayList Classes for their functionality with manipulating the deck and cards
import java.util.List;
import java.util.ArrayList;

public class Player {
    
    //Initializing variables and fields
    List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;
    int topCardPos = 25;
    int ctr = 0;

    //This is the Constructor for the Player class, taking in the List of Cards that make up their hand, their score, and their name
    public Player(List<Card> hand, int score, String name) {
        this.hand = hand;
        this.score = 0;
        this.name = name;
    }

    //This is the setter for the List of Cards that make up the player's hand
    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    //This is the setter for the player's score
    public void setScore(int score) {
        this.score = score;
    }

    //This is the setter for the player's name
    public void setName(String name) {
        this.name = name;
    }

    //This is the getter for the List of Cards that make up the player's hand
    public List<Card> getHand() {
        return hand;
    }

    //This is the getter for the player's score
    public int getScore() {
        return score;
    }

    //This is the getter for the player's name
    public String getName() {
        return name;
    }

    //This method is used to describe the player, specifically their name & score
    public void describe() {
        System.out.println("\n");
        System.out.println(name);
        System.out.println(score);
        
        //This for-loop is used to show and describe every card in the player's hand
        //This is useful to check to see that the player receives a full, shuffled hand of cards
        /*
        for(int i = 0; i < topCardPos; i++) {
            Card tempCard = hand.get(i);
            tempCard.describe();
        }
        */
    }

    //This method is used to flip the next card of the player's hand into play while removing it from play
    //It uses the .remove() method with the List class
    public Card flip() {
        return(hand.remove(0));
    }

    //This method is used to draw new cards from a built (and hopefully shuffled) deck into the player's hand
    public void draw(Deck newDeck) {
        hand.add(newDeck.draw());
    }

    //This method is used to increment the player's score
    public int incrementScore() {
        score++;
        return score;
    }

}
