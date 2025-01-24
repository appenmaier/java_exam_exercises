package exams1.classdiagrams.cashiersystem;

/**
 * Warengruppe
 *
 * @author Anarchiebald
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

   public String getDescription() {
      return description;
   }

}
