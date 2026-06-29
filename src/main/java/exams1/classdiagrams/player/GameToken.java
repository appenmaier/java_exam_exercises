package exams1.classdiagrams.player;

import java.util.Objects;

/**
 * Represents a game token with a type, color, and numeric value.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class GameToken {

   private final GameTokenType type;
   private final GameTokenColor color;
   private final int value;

   /**
    * Creates a new game token with the given type, color, and value.
    *
    * @param type  the type of the game token
    * @param color the color of the game token
    * @param value the numeric value of the game token
    */
   public GameToken(GameTokenType type, GameTokenColor color, int value) {
      this.type = type;
      this.color = color;
      this.value = value;
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
      GameToken other = (GameToken) obj;
      return color == other.color && type == other.type && value == other.value;
   }

   /** Returns the color of this game token. */
   public GameTokenColor getColor() {
      return color;
   }

   /** Returns the type of this game token. */
   public GameTokenType getType() {
      return type;
   }

   /** Returns the numeric value of this game token. */
   public int getValue() {
      return value;
   }

   @Override
   public int hashCode() {
      return Objects.hash(color, type, value);
   }

   @Override
   public String toString() {
      return "GameToken [type=" + type + ", color=" + color + ", value=" + value + "]";
   }

}
