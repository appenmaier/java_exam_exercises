package exams1.classdiagrams.cashiersystem;

/**
 * Represents a purchasable goods item that belongs to a specific class of goods.
 *
 * @author Anarchiebald
 * @version 1.0
 *
 */
public class Goods extends Product {

   private final ClassOfGoods classOfGoods;

   public Goods(int id, String description, String unit, double priceInEuro,
         ClassOfGoods classOfGoods) {
      super(id, description, unit, priceInEuro);
      this.classOfGoods = classOfGoods;
   }

   /** Returns the class of goods this item belongs to. */
   public ClassOfGoods classOfGoods() {
      return classOfGoods;
   }

   @Override
   public String toString() {
      return "Goods [id=" + id() + ", description=" + description() + ", unit=" + getUnit()
            + ", priceInEuro=" + getPriceInEuro() + ", classOfGoods=" + classOfGoods + "]";
   }

}
