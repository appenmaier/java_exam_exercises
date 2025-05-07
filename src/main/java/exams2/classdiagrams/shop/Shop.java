package exams2.classdiagrams.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Shop
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Shop<T extends Comparable<T>>(String name, Map<T, List<Integer>> assortment) {

   public void addProduct(T product) {
      if (!assortment.containsKey(product)) {
         assortment.put(product, new ArrayList<>());
      }
   }

   public void rateProduct(T product, int rating)
         throws NoProductFoundException, InvalidRatingException {
      if (assortment.containsKey(product) == false) {
         throw new NoProductFoundException();
      }

      if (rating < 1 || rating > 5) {
         throw new InvalidRatingException(rating);
      }

      List<Integer> ratings = assortment.get(product);
      ratings.add(rating);
   }

   public Optional<T> getBestRatedProduct() {
      T bestRatedProduct = null;
      double bestAverageRating = 0;

      for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
         T product = entry.getKey();
         List<Integer> ratings = entry.getValue();

         double totalRating = 0;
         for (int rating : ratings) {
            totalRating += rating;
         }
         double averageRating = totalRating / ratings.size();

         if (averageRating > bestAverageRating) {
            bestRatedProduct = product;
            bestAverageRating = averageRating;
         }
      }

      return Optional.ofNullable(bestRatedProduct);
   }

   public List<T> getAllProductsSortedByNaturalOrdering() {
      List<T> allProducts = new ArrayList<>();
      for (T product : assortment.keySet()) {
         allProducts.add(product);
      }
      Collections.sort(allProducts);
      return allProducts;
   }

}
