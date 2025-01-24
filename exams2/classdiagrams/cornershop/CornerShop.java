package exams2.classdiagrams.cornershop;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Tante-Emma-Laden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CornerShop(String name, Map<Goods, Integer> store) {

   public Optional<Integer> getAmountByDescription(String description) {
      for (Entry<Goods, Integer> entry : store.entrySet()) {
         if (entry.getKey().description().equals(description)) {
            return Optional.ofNullable(entry.getValue());
         }
      }
      return Optional.empty();
   }

   public void sellGoods(Goods goods, int amount) throws OutofStockException {
      if (!store.containsKey(goods) || store.get(goods) < amount) {
         throw new OutofStockException();
      }

      store.put(goods, store.get(goods) - amount);
   }

   public void buyGoods(Goods goods, int amount) {
      if (store.containsKey(goods)) {
         store.put(goods, store.get(goods) + amount);
      } else {
         store.put(goods, amount);
      }
   }

}
