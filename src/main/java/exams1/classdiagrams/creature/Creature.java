package exams1.classdiagrams.creature;

import java.util.Objects;

/**
 * Represents a creature with a name, type, and position that can move on a 2D grid.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Creature {

   private final String name;
   private final Position position;
   private final Type type;

   public Creature(String name, Type type, Position position) {
      this.name = name;
      this.type = type;
      this.position = position;
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
      Creature other = (Creature) obj;
      return Objects.equals(name, other.name) && Objects.equals(position, other.position)
            && type == other.type;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, position, type);
   }

   /** Moves the creature one step downward by decreasing its y coordinate. */
   public void moveDown() {
      position.decreaseY();
   }

   /** Moves the creature one step to the left by decreasing its x coordinate. */
   public void moveLeft() {
      position.decreaseX();
   }

   /** Moves the creature one step to the right by increasing its x coordinate. */
   public void moveRight() {
      position.increaseX();
   }

   /** Moves the creature one step upward by increasing its y coordinate. */
   public void moveUp() {
      position.increaseY();
   }

   /** Returns the name of this creature. */
   public String name() {
      return name;
   }

   /** Returns the current position of this creature. */
   public Position position() {
      return position;
   }

   @Override
   public String toString() {
      return "Creature [name=" + name + ", position=" + position + ", type=" + type + "]";
   }

   /** Returns the type of this creature. */
   public Type type() {
      return type;
   }

}
