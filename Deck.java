import java.util.*;


public class Deck{
  
  private ArrayList<Card> cards;

  public Deck(){
   this.cards = new ArrayList<Card>();
  }



  public void addCard(Card card){
    cards.add(card);//from card
  }
  
  public ArrayList<Card> getCards(){
    return this.cards;
  }

  public int cardCount(){
    return cards.size();
  } 
  
  public void shuffleCard(){
    Collections.shuffle(cards);
  }

  public Card pickCard(){
    if (cardCount() > 0){
      return cards.remove(0);
    }
    return null;  
  }


  public int cardsLeft(){
    return cardCount();
  }

  public void clearDeck(){
   cards.clear();
   }


public void setupDeck(){
  for ( SuitType suit : SuitType.values()){
    for (ValueType value : ValueType.values()){ addCard(new Card( suit, value));
    }
  }
}
}