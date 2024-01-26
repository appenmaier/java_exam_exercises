package exams2.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * LibraryTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LibraryTest {

  private static Book it;
  private static Library library;
  private static Book misery;

  @BeforeAll
  static void setUp() {
    it = new PaperBook(new Author("Stephen King", "US"), "Es", 1098);
    misery = new PaperBook(new Author("Stephen King", "US"), "Misery", 396);
    library = new Library("Stadtbibliothek", new HashMap<>());
    library.addBook(it);
    library.addBook(misery);
  }

  @Test
  void testGetBookByTitle() {
    assertEquals(misery, library.getBookByTitle("Misery"));
  }

  @Test
  void testGetPaperBooksByStatus() {
    assertEquals(2, library.getPaperBooksByStatus(Status.AVAILABLE).size());
  }

}
