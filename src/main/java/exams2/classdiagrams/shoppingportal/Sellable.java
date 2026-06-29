package exams2.classdiagrams.shoppingportal;

/**
 * Interface for items that can be sold, requiring a price accessor.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface Sellable {

   /**
    * Returns the price of this sellable item.
    *
    * @return the price
    */
   double price();

}
