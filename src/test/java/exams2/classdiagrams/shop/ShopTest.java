package exams2.classdiagrams.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * ShopTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ShopTest {

   private Shop<FastFood> shop;
   @Mock
   private FastFood product1;
   @Mock
   private FastFood product2;
   @Mock
   private FastFood product3;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);
      shop = new Shop<>("MyShop", new HashMap<>());
   }

   @Test
   void testAddProduct() {
      shop.addProduct(product1);
      assertNotNull(shop.assortment().get(product1));
   }

   @Test
   void testGetAllProductsSortedByNaturalOrdering() {
      when(product1.compareTo(product2)).thenReturn(-1);
      when(product1.compareTo(product3)).thenReturn(-1);
      when(product2.compareTo(product1)).thenReturn(1);
      when(product2.compareTo(product3)).thenReturn(-1);
      when(product3.compareTo(product1)).thenReturn(1);
      when(product3.compareTo(product2)).thenReturn(1);
      shop.addProduct(product2);
      shop.addProduct(product1);
      shop.addProduct(product3);
      assertEquals(product1, shop.getAllProductsSortedByNaturalOrdering().get(0));
      assertEquals(product2, shop.getAllProductsSortedByNaturalOrdering().get(1));
      assertEquals(product3, shop.getAllProductsSortedByNaturalOrdering().get(2));
   }

   @Test
   void testGetBestRatedProduct() throws NoProductFoundException, InvalidRatingException {
      assertEquals(Optional.empty(), shop.getBestRatedProduct());

      shop.addProduct(product1);
      shop.addProduct(product2);
      shop.rateProduct(product1, 5);
      shop.rateProduct(product2, 3);
      assertEquals(Optional.of(product1), shop.getBestRatedProduct());
      assertEquals(product1, shop.getBestRatedProduct().get());
   }

   @Test
   void testRateProduct() throws NoProductFoundException, InvalidRatingException {
      assertThrows(NoProductFoundException.class, () -> shop.rateProduct(product1, 1));

      shop.addProduct(product1);
      assertThrows(InvalidRatingException.class, () -> shop.rateProduct(product1, 0));
      assertThrows(InvalidRatingException.class, () -> shop.rateProduct(product1, 6));

      shop.rateProduct(product1, 3);
      shop.rateProduct(product1, 1);
      shop.rateProduct(product1, 5);
      assertEquals(3, shop.assortment().get(product1).size());
      assertEquals(1, shop.assortment().get(product1).get(1));
   }

}
