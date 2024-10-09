package exams2.classdiagrams.dictionary;

/**
 * Sprache
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Language {

  DE("DE", "Deutsch"), EN("EN", "Englisch"), FR("FR", "Franzoesisch");

  private final String code;
  private final String description;

  Language(String code, String description) {
    this.code = code;
    this.description = description;
  }

  public String code() {
    return code;
  }

  public String description() {
    return description;
  }

}
