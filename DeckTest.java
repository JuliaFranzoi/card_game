import static org.junit.Assert.assertEquals;
import org.junit.*;


public class DeckTest{
  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card("diamant", 5);
  }
  
  @Test
  public void deckStartsEmpty(){
    assertEquals(0, deck.cardCount());
  }
  
  @Test
  public void getSuit(){
    assertEquals("diamant", card.getSuit());
  }

  @Test
  public void getNumber(){
    assertEquals(5, card.getNumber());
  }
}