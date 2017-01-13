import java.util.*;



public class Player{
  private String name;
  private ArrayList<Card> hand;
  private Dealer dealer;
  
  public Player(String name, Dealer dealer){
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.dealer = dealer;
  }
  
  public String getName(){
    return this.name;
  }

  public void takeCardFromDealer() {
    addCard(dealer.deal());
  }

  public void addCard(Card card){
    hand.add(card);//from dealer-cardPicked
  }
  
  public int cardCount(){
    return hand.size();
  } 
  
  public ArrayList<Card> getCard(){
    return hand;
  }


}