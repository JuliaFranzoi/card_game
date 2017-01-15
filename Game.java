public class Game{
  private int turnCount;
  private Player player;
  private Dealer dealer;
  
  public Game(Deck cards Player player Dealer dealer){
    this.player = player
    this.cards = cards;
    this.turnCount = 0;
    this dealer = dealer;
  }


  public boolean nextTurn(){
    this.turnCount+=1;

    int result = deck.play();
  }

  public String getPlayer(){
    return this.player;
  }

  public int getTurncount(){
    return this.turnCount;
  }

  public int score(){
    return player.score;
  }
  
}