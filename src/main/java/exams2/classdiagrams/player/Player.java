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
