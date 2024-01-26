package exams1.cardsdealer;

import java.util.List;
import java.util.Random;

/**
 * Kartenausteiler
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CardsDealer {

  private final List<Card> deck;
  private final Player player1;
  private final Player player2;

  public CardsDealer(List<Card> deck, Player player1, Player player2) {
    this.deck = deck;
    this.player1 = player1;
    this.player2 = player2;
  }

  public void dealCards(int amount) {
    Random random = new Random();

    for (int i = 0; i < amount; i++) {
      int index1 = random.nextInt(deck.size());
      player1.addCard(deck.get(index1));
      deck.remove(index1);
      int index2 = random.nextInt(deck.size());
      player2.addCard(deck.get(index2));
      deck.remove(index2);
    }
  }

  public List<Card> deck() {
    return deck;
  }

  public Player player1() {
    return player1;
  }

  public Player player2() {
    return player2;
  }

}
