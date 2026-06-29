package exams2.queries.singles;

/**
 * Represents a music single with its artist, sales in millions, and publishing year.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Single(String name, Artist artist, int salesInMillions, String publishingYear) {

}
