package exams1.dicegames.dicegame04;

/**
 * Lebensmittelkategorie
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

   public String description() {
      return description;
   }

   public int points() {
      return points;
   }

}
