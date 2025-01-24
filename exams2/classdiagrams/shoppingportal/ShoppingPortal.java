package exams2.classdiagrams.shoppingportal;

import java.util.List;

/**
 * Einkaufsportal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ShoppingPortal(String user, List<Product> products,
      ShoppingCart<Product> shoppingCart) {

   public void addProductToShoppingCart(Product product, int amount) {
      shoppingCart.addItem(product, amount);
   }

   public void clearShoppingCart() {
      shoppingCart.items().clear();
   }

   public void removeProductFromShoppingCart(Product product) {
      shoppingCart.removeItem(product);
   }

}
