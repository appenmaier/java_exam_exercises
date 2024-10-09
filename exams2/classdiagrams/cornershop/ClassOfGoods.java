package exams2.classdiagrams.cornershop;

/**
 * Warengruppe
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum ClassOfGoods {

  BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES(
      "Gemuese");

  private final String description;

  ClassOfGoods(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
