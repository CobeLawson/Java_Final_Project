public class Card {

    //Initializing variables and fields
    private int value;
    private int suit;
    private StringBuilder name = new StringBuilder();
    
    //This is the Constructor for our Card class/object, taking in the value, suit, and name of our Card
    public Card(int value, int suit, StringBuilder name) {
        this.value = value;
        this.suit = suit;
        this.name = name;
        this.setName(name);
    }

    //This is the setter for our Card's value
    public void setValue(int value) {
        this.value = value;
    }

    //This is the setter for our Card's suit
    public void setSuit(int suit) {
        this.suit = suit;
    }

    //This is the setter for our Card's name
    public void setName(StringBuilder name) {
        //This switch statement uses the value of our Card to determine how we describe it in the name
        switch(value) {
            case(2):  
                name.append("Two of ");
                break;
            case(3):  
                name.append("Three of ");
                break;
            case(4):  
                name.append("Four of ");
                break;
            case(5):  
                name.append("Five of ");
                break;
            case(6):  
                name.append("Six of ");
                break;
            case(7):  
                name.append("Seven of ");
                break;
            case(8):  
                name.append("Eight of ");
                break;
            case(9):  
                name.append("Nine of ");
                break;
            case(10):  
                name.append("Ten of ");
                break;
            case(11):  
                name.append("Jack of ");
                break;
            case(12):  
                name.append("Queen of ");
                break;
            case(13):  
                name.append("King of ");
                break;
            case(14):  
                name.append("Ace of ");
                break;
            default:
                break;
        }

        //This switch statement takes the suit of our Card to determine how we describe it in the name
        switch(suit) {
            case(0):
                name.append("Spades");
                break;
            case(1):
                name.append("Clubs");
                break;
            case(2):
                name.append("Hearts");
                break;
            case(3):
                name.append("Diamonds");
                break;
            default:
                break;
        }
    }

    //This is the getter for the value of our Card
    public int getValue() {
        return value;
    }

    //This is the getter for the suit of our Card
    public int getSuit() {
        return suit;  
    }

    //This is the getter for the name of our Card
    public StringBuilder getName() {
        return name;
    }

    //This method is used to describe our card, displaying the full name we have built using the setName() method we built earlier
    public void describe() {
        System.out.println(name);
    }
}
