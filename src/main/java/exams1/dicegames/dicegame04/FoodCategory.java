package exams1.dicegames.dicegame04;

/**
 * Enum of food categories, each with a German description and a health-score point value.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum FoodCategory {

   BEVERAGES("Getränke", 1), VEGETABLES("Gemüse", 2), FRUITS("Obst", 2), GRAIN_PRODUCTS(
         "Getreideprodukte", 3), POTATOES("Kartoffeln", 3), DAIRY_PRODUCTS("Milchprodukte",
               4), MEAT("Fleisch", 4), FISH("Fisch", 4), EGGS("Eier",
                     4), FATS_AND_OILS("Fette und Öle", 5), SWEETS("Süßigkeiten", 6);

   private final String description;
   private final int points;

   FoodCategory(String description, int points) {
      this.description = description;
      this.points = points;
   }

   /** Returns the German display name of this food category. */
   public String description() {
      return description;
   }

   /** Returns the health-score point value assigned to this food category. */
   public int points() {
      return points;
   }

}
