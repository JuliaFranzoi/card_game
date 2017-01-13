import static org.junit.Assert.assertEquals;
import org.junit.*;


public class DeckTest{
  Deck deck;
  Card card, card2;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card("diamant", "five");
    card2 = new Card("Spade", "two");
  }
  
  @Test
  public void deckStartsEmpty(){
    assertEquals(0, deck.cardCount());
  }
  
  // @Test
  // public void getSuit(){
  //   assertEquals("diamant", card.getSuit());
  // }

  // @Test
  // public void getNumber(){
  //   assertEquals(5, card.getNumber());
  // }

  // @Test
  // public void checkShuffle(){
  //   deck.addCard(card);
  //   deck.addCard(card2);
  //   deck.shuffleCard();
  //   deck.pickCard();
  //   assertEquals(1, deck.cardCount());
  // }
  @Test 
  public void checkPickCard(){
    deck.addCard(card);
    // deck.shuffleCard();
    assertEquals(card, deck.pickCard());
  }


  @Test
  public void checkShuffle(){
    deck.addCard(card);
    deck.addCard(card2);
    deck.shuffleCard();
    deck.pickCard();
    deck.pickCard();
    assertEquals(0, deck.cardCount());
  }

  @Test
  public void deckHasCards(){
    deck.addCard(card);
    deck.addCard(card2);
    assertEquals(2, deck.cardCount());
  }
}