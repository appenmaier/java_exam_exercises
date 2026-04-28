package exams2.classdiagrams.cornershop;

/**
 * Represents a category of goods sold in a corner shop.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ClassOfGoods {

   BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES(
         "Gemuese");

   private final String description;

   ClassOfGoods(String description) {
      this.description = description;
   }

   /**
    * Returns the human-readable description of this goods category.
    */
   public String description() {
      return description;
   }

}
