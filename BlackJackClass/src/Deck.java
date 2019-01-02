import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(int numDecks){
        ArrayList<String> suits=new ArrayList<>();
        suits.add("diamonds");
        suits.add("clubs");
        suits.add("spades");
        suits.add("hearts");

        cards=new ArrayList<>();
        for (int d=0;d<numDecks;d++){
            for (int s=0;s<suits.size();s++){
                for (int n=1;n<14;n++){
                    cards.add(new Card(suits.get(s),n));
                }
            }
        }
    }

    public Card deal(){
        Card temp=cards.get(0);
        cards.remove(0);
        return temp;
    }
    public boolean empty(){
        if (cards.size()==0){
            return true;
        } else {
            return false;
        }
    }
    public void shuffle(){
        Collections.shuffle(this.cards);
    }
}
