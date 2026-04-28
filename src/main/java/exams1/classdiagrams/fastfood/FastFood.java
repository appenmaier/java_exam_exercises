package exams1.classdiagrams.fastfood;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a fast food item that can be vegetarian and accumulates customer ratings.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FastFood extends Food {

   private boolean isVegetarian;
   private List<Integer> ratings;

   public FastFood(String name, FoodCategory foodCategory, double calories, boolean isVegetarian) {
      super(name, foodCategory, calories);
      this.isVegetarian = isVegetarian;
      ratings = new ArrayList<>();
   }

   /** Adds a rating to this fast food item's list of ratings. */
   public void addRating(int rating) {
      ratings.add(rating);
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
      FastFood other = (FastFood) obj;
      return isVegetarian == other.isVegetarian && Objects.equals(ratings, other.ratings);
   }

   /** Calculates and returns the average of all ratings for this fast food item. */
   public double getAverageRating() {
      int total = 0;
      for (int r : ratings) {
         total += r;
      }
      double averageRating = (double) total / ratings.size();
      return averageRating;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(isVegetarian, ratings);
      return result;
   }

   /** Returns whether this fast food item is vegetarian. */
   public boolean isVegetarian() {
      return isVegetarian;
   }

   /** Returns the list of ratings for this fast food item. */
   public List<Integer> ratings() {
      return ratings;
   }

   @Override
   public String toString() {
      return "FastFood [isVegetarian=" + isVegetarian + ", ratings=" + ratings + ", calories()="
            + calories() + ", foodCategory()=" + foodCategory() + ", name()=" + name() + "]";
   }

}
