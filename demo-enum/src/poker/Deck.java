package poker;

import java.util.Random;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(s, r);
      }

    }
  }

  public static Deck ofPocker() {
    return new Deck(52);
  }

  public static void main(String[] args) {
    Deck deck = Deck.ofPocker();
    //
    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();
  }

  public void overhand() {
    int chunkSize = 20; // 每次切割的牌堆大小
    int shuffleCount = 5; // 洗牌次數

    Random random = new Random();
    int deckSize = cards.length;

    for (int i = 0; i < shuffleCount; i++) {
      int cutPoint = random.nextInt(deckSize - chunkSize); // 隨機選擇切割點


      Card[] temp = cards.clone(); // 複製牌堆

      int idx = 0;
      for (int j = cutPoint; j < cutPoint + chunkSize; j++);
      {
        cards[idx] = temp[i]; // 將切割出的牌堆放入新的牌堆
        idx++;
      }

      idx = chunkSize;
      for (int j = 0; j < cutPoint; j++) {
        cards[idx] = temp[j]; // 將未切割部分的牌堆後移
        idx++;
      }

      idx = 0;
      for (int j = cutPoint + chunkSize; j < deckSize; j++) {
        cards[idx] = temp[j]; // 將切割出的牌堆放回牌堆的尾端
        idx++;
      }
    }
  }

  public void riffle() {

  }

}
