package exams2.classdiagrams.cornershop;

import java.util.Objects;

/**
 * Represents a specific goods item with a category and unit of measurement.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Goods extends Product implements Comparable<Goods> {

   private final ClassOfGoods classOfGoods;
   private final String unit;

   public Goods(String description, double price, String currency, ClassOfGoods classOfGoods,
         String unit) {
      super(description, price, currency);
      this.classOfGoods = classOfGoods;
      this.unit = unit;
   }

   /**
    * Returns the category this goods item belongs to.
    */
   public ClassOfGoods classOfGoods() {
      return classOfGoods;
   }

   /** Compares this goods item to another by description alphabetically. */
   @Override
   public int compareTo(Goods other) {
      return description().compareTo(other.description());
   }

   /**
    * Returns the unit of measurement for this goods item.
    */
   public String unit() {
      return unit;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(classOfGoods, unit);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Goods other = (Goods) obj;
      return classOfGoods == other.classOfGoods && Objects.equals(unit, other.unit);
   }

   @Override
   public String toString() {
      return "Goods [classOfGoods=" + classOfGoods + ", unit=" + unit + "]";
   }

}
