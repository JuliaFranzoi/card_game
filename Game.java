public class Game{
  private int turnCount;
  private Player player;
  
  public Game(Deck cards Player player){
    this.cards = cards;
    this.turnCount = 0;
  }


  public boolean nextTurn(){
    this.turnCount+=1;

    int result = deck.play();
  }

  public String getPlayer(){
    return this.player;
  }

  public int getTurncount(){
    return this turnCount;
  }
}