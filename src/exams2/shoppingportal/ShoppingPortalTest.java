package exams2.shoppingportal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ShoppingPortalTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShoppingPortalTest {

  private Product dualSense;
  private Product gow2;
  private Product ps5;
  private ShoppingPortal shoppingPortal;

  @BeforeEach
  void setUp() {
    shoppingPortal = new ShoppingPortal("Max Mustermaier", new ArrayList<>(), new ShoppingCart<>());
    ps5 = new Product("PlayStation 5", 499.99);
    gow2 = new Product("God of War Ragnaroek", 79.99);
    dualSense = new Product("DualSense Wireless-Controller", 69.99);
    shoppingPortal.addProductToShoppingCart(ps5, 1);
    shoppingPortal.addProductToShoppingCart(gow2, 1);
  }

  @Test
  void testAddProductToShoppingCart() {
    double total = 499.99 + 79.99 + 2 * 69.99;
    shoppingPortal.addProductToShoppingCart(dualSense, 2);
    assertEquals(total, shoppingPortal.shoppingCart().getTotal());
  }

  @Test
  void testClearShoppingCart() {
    shoppingPortal.clearShoppingCart();
    assertEquals(0, shoppingPortal.shoppingCart().items().size());
  }

  @Test
  void testRemoveProductFromShoppingCart() {
    shoppingPortal.removeProductFromShoppingCart(ps5);
    assertEquals(1, shoppingPortal.shoppingCart().items().size());
  }

}
