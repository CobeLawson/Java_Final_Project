//import in the Scanner Class so that we can allow user-input to determine player names
//import in the List and ArrayList Classes for their functionality with manipulating the deck and cards
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); //This scanner object will allow us to use user-input to create our player names
        Deck playDeck = new Deck(); //Initialize a new Deck, which will be built using the Deck constructor
        playDeck.shuffle(); //Calling our shuffle method to shuffle our new Deck
        List<Card> player1Cards = new ArrayList<Card>();    //This line and the next initialize the two Lists of Cards for our players' hands
        List<Card> player2Cards = new ArrayList<Card>();    
        int player1Score = 0;   //This line and the next initialize our players scores
        int player2Score = 0;

        //This is where we allow the user to determine the two players' names
        System.out.println("\n");
        System.out.println("Enter Player 1 Name: ");
        String player1Name = myObj.nextLine();
        Player player1 = new Player(player1Cards, player1Score, player1Name);   //This is where we initialize the first Player
        System.out.println("\n");
        System.out.println("Enter Player 2 Name: ");
        String player2Name = myObj.nextLine();
        Player player2 = new Player(player2Cards, player2Score, player2Name);   //This is where we initialize the second Player
        System.out.println("\n");
        myObj.close();  //We must close our Scanner object to reduce computing consumption

        //This for-loop and nested if-else is used to evenly distribute the cards from the Deck into the two Players' hands
        for(int i = 0; i < 51; i++) {
            if(i % 2 == 0) {
                player1.draw(playDeck);
            }
            else {
                player2.draw(playDeck);
            }
        }

        //This for-loop is used so that both Players are able to play their full hands
        for(int i = 0; i < 25; i++) {
            Card player1Card = player1.flip(); //Here we call the .flip() method we built to assign the first Player's Card (Second Player coming next)
            player1Card.describe(); //We use the .describe() method here so we can keep track of the first Player's Card (Second Player coming next)
            Card player2Card = player2.flip();
            player2Card.describe();

            //Now we use an if-else_if statement to determine which player gets a point by winning the round
            if(player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            }
            else if(player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
            }

            //Here we use our .getScore() method to store into our local variables
            player1Score = player1.getScore();
            player2Score = player2.getScore();   
            
            //Here we print out both Players' scores to keep track of where we are at
            System.out.println(player1Name + "'s Score : " + player1Score);
            System.out.println(player2Name + "'s Score : " + player2Score);
            System.out.println("\n");
        }

        //Finally we use a last if-else_if-else statement to determine who has won the game
        if(player1Score > player2Score) {
            System.out.println(player1Name + " Wins!");
        }
        else if(player2Score > player1Score) {
            System.out.println(player2Name + " Wins!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}
