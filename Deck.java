import java.util.*;


public class Deck{
  
  private ArrayList<Card> decker;


  public Deck(){
   this.decker= new ArrayList<Card>();
  }

  public void addCard(Card card){
    decker.add(card);//from card
  }
  
  public ArrayList<Card> getDeck(){
    return this.decker;
  }

  public int cardCount(){
    return decker.size();
  } 
  
  public void shuffleCard(){
    Collections.shuffle(decker);
  }

  public String pickCard(){
    if (cardCount() > 0){
      return decker.remove(0);
    }
  } 

  public int cardsLeft(){
    return cardCount();
  }
  public void sleep(){
   belly.clear();
   }
}