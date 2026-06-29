package exams2.classdiagrams.player;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import lombok.Data;

/**
 * Represents a player who holds hand cards, plays them onto rows, and manages action points.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Player {

   private final String name;
   private final List<Card> handCards;
   private final Map<Card, Integer> playedCards;
   private int actionPoints;

   /**
    * Returns the played card with the highest power value in the specified row, if any.
    *
    * @param row the row index to search
    * @return an {@link java.util.Optional} containing the most powerful card in that row, or empty if the row is empty
    */
   public Optional<Card> getMostPowerfulCardByRow(int row) {
      Card card = null;
      int power = 0;

      for (Entry<Card, Integer> entry : playedCards.entrySet()) {
         if (entry.getValue() == row && entry.getKey().power() > power) {
            power = entry.getKey().power();
            card = entry.getKey();
         }
      }

      return Optional.ofNullable(card);
   }

   /**
    * Plays the given card from the hand onto the specified row, deducting its action point cost.
    *
    * @param card the card to play
    * @param row  the row index to place the card in
    * @throws CardNotFoundException          if the card is not in the player's hand
    * @throws NotEnoughActionPointsException if the player does not have enough action points
    */
   public void playCard(Card card, int row)
         throws CardNotFoundException, NotEnoughActionPointsException {
      if (!handCards.contains(card)) {
         throw new CardNotFoundException();
      }

      if (actionPoints < card.costs()) {
         throw new NotEnoughActionPointsException();
      }

      handCards.remove(card);
      playedCards.put(card, row);
      actionPoints -= card.costs();
   }

}
