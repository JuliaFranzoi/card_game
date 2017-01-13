import java.util.*;


public class Dealer{
  Deck deck;

  public Dealer(Deck deck){
    this.deck = deck;
  }
  
  

  public Card deal(){
    Card cardPicked = deck.pickCard();
    return cardPicked;
    // return cardPicked;
  }
  
  

}



