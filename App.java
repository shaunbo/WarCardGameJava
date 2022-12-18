public class App {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("John");
        Player player2 = new Player("Bob");

        deck.shuffle();
        
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            }
            else {            
                player2.draw(deck);
            }
        }
        
        for (int i = 0; i < 26; i++) {
            Card flipped1 = player1.flip();
            Card flipped2 = player2.flip();

            System.out.print(player1.getName() + " draws a ");
            flipped1.describe();
            System.out.print(player2.getName() + " draws a ");
            flipped2.describe();
            
            
            if (flipped1.getValue() > flipped2.getValue()) {
                System.out.println(player1.getName() + " wins the round!!");
                player1.incrementScore();
            }
            else {
                System.out.println(player2.getName() + " wins the round!!");
                player2.incrementScore();
            }
          
        }
        System.out.println(player1.getName() + " has " + player1.getScore() + " points");
        System.out.println(player2.getName() + " has " + player2.getScore() + " points");
        
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " WINS THE GAME!");
        }
        else if (player1.getScore() == player2.getScore()) {
            System.out.println(player1.getName() + " and " + player2.getName() + " TIE THE GAME!");
        }
        else {
            System.out.println(player2.getName() + " WINS THE GAME!");
        }
        
    }
}
