public class Card {
    private String suit;
    private int number;
    private String numberStr;

    public Card(String suitIn, int numberIn){
        this.suit=suitIn;
        this.number=numberIn;
        this.setNumberStr();
    }
    public void setNumberStr(){
        String temp;
        if (this.number==1){
            temp="ace";
        } else if(this.number==11){
            temp="jack";
        } else if(this.number==12){
            temp="queen";
        } else if(this.number==13){
            temp="king";
        } else {
            temp=""+this.number;
        }
        this.numberStr=temp;
    }

    public String toString(){
        return this.numberStr+" of "+this.suit;
    }

    public String getNumberStr(){
        return this.numberStr;
    }
    public int getNumber(){
        return this.number;
    }
    public String getSuit(){
        return this.suit;
    }


}
