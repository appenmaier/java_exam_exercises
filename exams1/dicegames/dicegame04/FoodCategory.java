package exams1.dicegames.dicegame04;

/**
 * Lebensmittelkategorie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum FoodCategory {

   X("X", 3), Y("Y", 2), Z("Z", 3);

   private final String description;
   private final int points;

   FoodCategory(String description, int points) {
      this.description = description;
      this.points = points;
   }

   public String description() {
      return description;
   }

   public int points() {
      return points;
   }

}
