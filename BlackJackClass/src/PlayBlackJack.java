import java.util.ArrayList;

public class PlayBlackJack {
    public static void main(String[] args) {
        int numDecks = 1;
        int numPlayers = 10;
        int stayOn = 17;

        Deck deck = new Deck(numDecks);
        deck.shuffle();
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("dealer"));
        for (int n = 1; n < numPlayers; n++) {
            players.add(new Player("player " + n));
        }

        for (int r = 0; r < 2; r++) {
            for (int p = 0; p < players.size(); p++) {
                players.get(p).takeCard(deck.deal());
            }
        }

        for (int p = players.size() - 1; p >= 0; p--) {
            while (players.get(p).getScore() < stayOn) {
                players.get(p).takeCard(deck.deal());
            }
        }

        System.out.println(players.get(0));
        int dealerScore = players.get(0).getScore();
        if (dealerScore > 21) {
            dealerScore = 0;
        }
        int playerScore;
        for (int p = 1; p < players.size(); p++) {
            playerScore = players.get(p).getScore();
            System.out.println(players.get(p));
            if (playerScore > 21){
                System.out.println("busts\n");
            }else if(playerScore>dealerScore){
                System.out.println("wins\n");
            } else if (playerScore==dealerScore){
                System.out.println("push\n");
            } else {
                System.out.println("loses\n");
            }
        }
    }
}










