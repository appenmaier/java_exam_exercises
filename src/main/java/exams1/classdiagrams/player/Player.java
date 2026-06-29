package exams1.classdiagrams.player;

import java.util.List;
import java.util.Objects;

/**
 * Represents a player who holds a collection of game tokens.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

   private final String name;
   private final List<GameToken> gameTokens;

   /**
    * Creates a new player with the given name and initial list of game tokens.
    *
    * @param name        the name of the player
    * @param gameTokens  the initial list of game tokens for this player
    */
   public Player(String name, List<GameToken> gameTokens) {
      this.name = name;
      this.gameTokens = gameTokens;
   }

   /** Adds a game token to this player's collection. */
   public void addGameToken(GameToken gameToken) {
      gameTokens.add(gameToken);
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
      Player other = (Player) obj;
      return Objects.equals(gameTokens, other.gameTokens) && Objects.equals(name, other.name);
   }

   /** Returns the list of game tokens held by this player. */
   public List<GameToken> gameTokens() {
      return gameTokens;
   }

   @Override
   public int hashCode() {
      return Objects.hash(gameTokens, name);
   }

   /** Returns the name of this player. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Player [name=" + name + ", gameTokens=" + gameTokens + "]";
   }

}
