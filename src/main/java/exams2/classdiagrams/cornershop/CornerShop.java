package exams2.classdiagrams.cornershop;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents a corner shop that manages its stock of goods.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CornerShop(String name, Map<Goods, Integer> store) {

   /**
    * Returns the stock amount of the goods matching the given description, if present.
    */
   public Optional<Integer> getAmountByDescription(String description) {
      for (Entry<Goods, Integer> entry : store.entrySet()) {
         if (entry.getKey().description().equals(description)) {
            return Optional.ofNullable(entry.getValue());
         }
      }
      return Optional.empty();
   }

   /**
    * Reduces the stock of the given goods by the specified amount, or throws an exception if insufficient stock exists.
    */
   public void sellGoods(Goods goods, int amount) throws OutofStockException {
      if (!store.containsKey(goods) || store.get(goods) < amount) {
         throw new OutofStockException();
      }

      store.put(goods, store.get(goods) - amount);
   }

   /**
    * Increases the stock of the given goods by the specified amount, adding it to the store if not yet present.
    */
   public void buyGoods(Goods goods, int amount) {
      if (store.containsKey(goods)) {
         store.put(goods, store.get(goods) + amount);
      } else {
         store.put(goods, amount);
      }
   }

}
