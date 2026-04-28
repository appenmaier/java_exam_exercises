package exams2.classdiagrams.shoppingportal;

/**
 * Represents a product with a description and price that can be sold through the shopping portal.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Product(String description, double price) implements Sellable {

}
