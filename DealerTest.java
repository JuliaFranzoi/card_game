import static org.junit.Assert.assertEquals;
import org.junit.*;


public class DealerTest{
  Deck deck;
  Card card; 
  Dealer dealer;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card("diamond", "five");
    dealer = new Dealer(deck);
  }
  
  @Test
  public void getCardsFromDeck(){
    deck.addCard(card);
    Card dealtCard = dealer.deal();
    assertEquals(5, dealtCard.getNumber());
  }
 } 