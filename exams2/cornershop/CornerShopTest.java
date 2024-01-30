package exams2.cornershop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.TreeMap;
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

  private Goods bread;
  private Goods butter;
  private CornerShop cornerShop;
  private Goods milk;

  @BeforeEach
  void setUp() {
    bread = new Goods("Brot", ClassOfGoods.BAKERY_PRODUCTS, 2.49, "Laib");
    butter = new Goods("Butter", ClassOfGoods.DAIRY_PRODUCTS, 2.29, "Stück");
    milk = new Goods("Milch", ClassOfGoods.DAIRY_PRODUCTS, 1.79, "Flasche");
    cornerShop = new CornerShop("Tante-Emma-Laden", new TreeMap<>());
    cornerShop.store().put(bread, 5);
    cornerShop.store().put(butter, 10);
    cornerShop.store().put(milk, 5);
  }

  @Test
  void testBuyGoods() {
    cornerShop.buyGoods(bread, 5);
    assertEquals(10, cornerShop.store().get(bread));
    assertEquals(10, cornerShop.store().get(butter));
    assertEquals(5, cornerShop.store().get(milk));
  }

  @Test
  void testGetEntryByDescription() {
    assertEquals(milk, cornerShop.getEntryByDescription("Milch").getKey());
    assertEquals(5, cornerShop.getEntryByDescription("Milch").getValue());
  }

  @Test
  void testSellGoods() {
    cornerShop.sellGoods(bread, 2);
    assertEquals(3, cornerShop.store().get(bread));
    assertEquals(10, cornerShop.store().get(butter));
    assertEquals(5, cornerShop.store().get(milk));
  }

}
