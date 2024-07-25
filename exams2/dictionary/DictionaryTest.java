package exams2.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * DictionaryTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DictionaryTest {

  private Dictionary dictionary;

  @BeforeEach
  void setUp() throws InvalidLanguageException {
    dictionary = new Dictionary(Language.DE, Language.EN, new TreeMap<>());
    dictionary.addEntry(new Word("Blume", Language.DE), new Word("Flower", Language.EN));
  }

  @Test
  void testAddEntry() {
    assertThrows(InvalidLanguageException.class,
        () -> dictionary.addEntry(new Word("Car", Language.EN), new Word("Auto", Language.DE)));
    assertThrows(InvalidLanguageException.class,
        () -> dictionary.addEntry(new Word("Auto", Language.DE), new Word("Voiture", Language.FR)));
  }

  @Test
  void testGetTranslation() {
    assertEquals("Flower", dictionary.getTranslation("Blume"));
    assertEquals("Blume", dictionary.getTranslation("Flower"));
    assertEquals(null, dictionary.getTranslation("Auto"));
  }

  @Test
  void testImportEntries() throws FileNotFoundException {
    dictionary.importEntries(new File("jappuccini/exams2/dictionary/dictionary.txt"));
    assertEquals(new Word("House", Language.EN),
        dictionary.entries().get(new Word("Haus", Language.DE)));
    assertEquals(new Word("Mouse", Language.EN),
        dictionary.entries().get(new Word("Maus", Language.DE)));
    assertEquals(new Word("Tree", Language.EN),
        dictionary.entries().get(new Word("Baum", Language.DE)));
  }

}
