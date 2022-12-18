import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

public Player() {
    score = 0;
}
public Player(String name) {
    this.name = name;
    score = 0;
}
public void describe() {
    System.out.println(name + " has " + score + " points ");
    System.out.println(name + " hand: ");
    for (Card card : hand) {
        card.describe();
    }
}
public Card flip() {
    return hand.remove(0);
}
public void draw(Deck deck) {
    hand.add(deck.draw());
}
public void incrementScore() {
    score++;
}
public int getScore() {
    return score;
}
public String getName() {
    return name;
}
}
