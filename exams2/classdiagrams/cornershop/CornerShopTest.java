package exams2.classdiagrams.cornershop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * CornerShopTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CornerShopTest {

  private CornerShop cornerShop;
  private Goods bread;
  private Goods butter;
  private Goods milk;
  private Goods eggs;

  @BeforeEach
  void setUp() {
    bread = new Goods("Brot", 2.49, "Euro", ClassOfGoods.BAKERY_PRODUCTS, "Laib");
    butter = new Goods("Butter", 2.29, "Euro", ClassOfGoods.DAIRY_PRODUCTS, "Stück");
    milk = new Goods("Milch", 1.79, "Euro", ClassOfGoods.DAIRY_PRODUCTS, "Flasche");
    eggs = new Goods("Eier", 2.49, "Euro", ClassOfGoods.DAIRY_PRODUCTS, "Packung");
    cornerShop = new CornerShop("Tante-Emma-Laden", new HashMap<>());
    cornerShop.store().put(bread, 5);
    cornerShop.store().put(butter, 10);
    cornerShop.store().put(milk, 5);
  }

  @Test
  void testBuyGoods() {
    cornerShop.buyGoods(bread, 5);
    cornerShop.buyGoods(eggs, 1);
    assertEquals(10, cornerShop.store().get(bread));
    assertEquals(10, cornerShop.store().get(butter));
    assertEquals(5, cornerShop.store().get(milk));
    assertEquals(1, cornerShop.store().get(eggs));
  }

  @Test
  void testGetAmountByDescription() {
    assertEquals(5, cornerShop.getAmountByDescription("Milch").get());
    assertEquals(Optional.empty(), cornerShop.getAmountByDescription("Eier"));
  }

  @Test
  void testSellGoods() throws OutofStockException {
    cornerShop.sellGoods(bread, 2);
    assertEquals(3, cornerShop.store().get(bread));
    assertEquals(10, cornerShop.store().get(butter));
    assertEquals(5, cornerShop.store().get(milk));
    assertThrows(OutofStockException.class, () -> cornerShop.sellGoods(bread, 5));
    assertThrows(OutofStockException.class, () -> cornerShop.sellGoods(eggs, 1));
  }

}
