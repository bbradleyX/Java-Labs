import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int score;
    private String name;

    public Player(String nameIn){
        this.name=nameIn;
        this.hand=new ArrayList<>();
        this.score=0;
    }
    public void takeCard(Card cardIn){
        hand.add(cardIn);
        this.calcScore();
    }
    public String getName(){
        return this.name;
    }

    public void calcScore(){
        this.score=0;
        int numAces=0;
        int cardValue;
        for (int i=0;i<hand.size();i++){
            cardValue=hand.get(i).getNumber();
            if (cardValue==1){
                this.score+=11;
                numAces++;
            } else if (cardValue>10){
                this.score+=10;
            } else {
                this.score+=cardValue;
            }
        }
        while (this.score>21 && numAces>0){
            this.score-=10;
            numAces--;
        }
    }

    public String toString(){
        String temp=this.name+"\n";
        for (int i=0;i<hand.size();i++){
            temp+=" "+hand.get(i)+"\n";
        }
        temp+=" score: "+this.score;
        return temp;
    }
    public int getScore(){
        return this.score;
    }
}
