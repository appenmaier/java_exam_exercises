package exams1.classdiagrams.cookiejar;

import java.util.Objects;

/**
 * Zutat
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Ingredient {

   private final String name;
   private final double amount;
   private final String unit;

   public Ingredient(String name, double amount, String unit) {
      this.name = name;
      this.amount = amount;
      this.unit = unit;
   }

   public String getName() {
      return name;
   }

   public double getAmount() {
      return amount;
   }

   public String getUnit() {
      return unit;
   }

   @Override
   public int hashCode() {
      return Objects.hash(amount, name, unit);
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
      Ingredient other = (Ingredient) obj;
      return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
            && Objects.equals(name, other.name) && Objects.equals(unit, other.unit);
   }

   @Override
   public String toString() {
      return "Ingredient [name=" + name + ", amount=" + amount + ", unit=" + unit + "]";
   }

}
