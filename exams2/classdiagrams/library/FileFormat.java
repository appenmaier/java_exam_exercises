package exams2.classdiagrams.library;

/**
 * Dateiformat
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum FileFormat {

  AZW("Amazon Kindle"), EPUB("Electronic Publication"), LRF("Portable Reader File");

  private final String description;

  FileFormat(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
