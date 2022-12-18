public class Card {
    
    private int value;
    private String suit;

    public Card() {
        this.value = 0;
        this.suit = "empty";
    }
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void describe() {
        String faceValue = "";

        switch (value) {
            case 11: faceValue = "Jack";
            break;
            case 12: faceValue = "Queen";
            break;
            case 13: faceValue = "King";
            break;
            case 14: faceValue = "Ace";
            break;
            default: faceValue = Integer.toString(value);
        }
        System.out.println(faceValue + " of " + suit); 
    }

}
