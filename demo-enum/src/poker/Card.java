package poker;

public class Card {
  
  private Rank rank;
  
  private Suit suit;

  public Card() {

  }

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }


}
