import java.util.*;


public class Dealer{
  Deck deck;

  public Dealer(Deck deck){
    this.deck = deck;
  }
  
  public Card pickCard(){
    Card cardPicked = deck.pickCard();
    return cardPicked;
  }
  


}



