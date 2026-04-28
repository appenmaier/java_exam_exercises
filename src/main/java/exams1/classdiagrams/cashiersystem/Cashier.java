package exams1.classdiagrams.cashiersystem;

/**
 * Represents a cashier identified by an ID and a name.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class Cashier {

   private final int id;
   private final String name;

   public Cashier(int id, String name) {
      this.id = id;
      this.name = name;
   }

   /** Returns the unique identifier of this cashier. */
   public int id() {
      return id;
   }

   /** Returns the name of this cashier. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Cashier [id=" + id + ", name=" + name + "]";
   }

}
