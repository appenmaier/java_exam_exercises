package exams1.classdiagrams.cardsdealer;

import java.util.Objects;

/**
 * Represents a playing card with a colour and a numeric value.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Card {

   private final String colour;
   private final int value;

   public Card(String colour, int value) {
      this.colour = colour;
      this.value = value;
   }

   /** Returns the colour of this card. */
   public String colour() {
      return colour;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Card other = (Card) obj;
      return Objects.equals(colour, other.colour) && value == other.value;
   }

   @Override
   public int hashCode() {
      return Objects.hash(colour, value);
   }

   @Override
   public String toString() {
      return "Card [colour=" + colour + ", value=" + value + "]";
   }

   /** Returns the numeric value of this card. */
   public int value() {
      return value;
   }

}
