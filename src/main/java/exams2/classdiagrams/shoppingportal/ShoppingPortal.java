package exams2.classdiagrams.shoppingportal;

import java.util.List;

/**
 * Represents an online shopping portal where a user can browse products and manage a shopping cart.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ShoppingPortal(String user, List<Product> products,
      ShoppingCart<Product> shoppingCart) {

   /**
    * Adds the given product in the specified quantity to the shopping cart.
    */
   public void addProductToShoppingCart(Product product, int amount) {
      shoppingCart.addItem(product, amount);
   }

   /**
    * Removes all items from the shopping cart.
    */
   public void clearShoppingCart() {
      shoppingCart.items().clear();
   }

   /**
    * Removes all cart entries for the given product from the shopping cart.
    */
   public void removeProductFromShoppingCart(Product product) {
      shoppingCart.removeItem(product);
   }

}
