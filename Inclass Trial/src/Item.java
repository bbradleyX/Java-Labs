/*UML Diagram:

Class: War

Properties: <int> deckListist, <int> playerADeck, <int> playerBDeck

Methods: void ShuffleDeck(deckList)- randomizes items in deck list; void SplitDeck(deckList)-to disperse cards amongst players;
         WinTurn()- puts the values at the end of the end list;
         RunTurn()- each player will place a card down; TieBreaker()- pulls out 4 random cards from the player;
         EndGame()- returns true if game is over*/
/* <Card>: holds a list multiple objects

   Class: Card
   Properties: int value, String suit
   Method: None

   Class: Deck
   Properties: <card> Cards
   Methods: Deck(int); void Shuffle(); card DealCard()

   Class: Player
   Properties: <Card> Hand, <Card> WinPile
   Methods: Player(); void takeCard((type CardIn)); Card PlayCard(); void takePile(<Card> Pile)

   Class: Game
   Properties: Deck, <Players> players, tieDeck
   Methods:
 */

//public class WarGame {}
public class Item {
    private String itemName;
    private int numberInStock;
    public Item(String itemName, int initialOrder){
        this.itemName = itemName;
        this.numberInStock = initialOrder;
    }
    public void reStock(int numberOrdered){
         this.numberInStock= numberInStock + numberOrdered;
    }
    public void sellItem(int numberSold){
        this.numberInStock = this.numberInStock - numberSold;
    }
    public boolean needReorder(){
        if (numberInStock < 10)
            return true;
        else return false;
    }
    public String getItemName(){
        return itemName;
    }
    public int getNumberInStock(){
        return numberInStock;
    }
}
