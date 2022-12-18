import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    
    List<Card> cards = new ArrayList<Card>(); 
    List<String> suits = Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs");

public Deck() {
    for (int i = 2; i < 15; i++) {
        for (String suit : suits) {
            cards.add(new Card(i, suit));
        }
    }
}

public void shuffle() {
    Collections.shuffle(cards);
}

public Card draw() {
    return cards.remove(0);
}

}
