package exams1.classdiagrams.fastfood;

/**
 * Lebensmittelkategorie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum FoodCategory {

  BEVERAGES("Getraenke", 1), DAIRY_PRODUCTS("Milchprodukte", 4), EGGS("Eier", 4),
  FATS_AND_OILS("Fette und Oele", 5), FISH("Fisch", 4), FRUITS("Obst", 2),
  GRAIN_PRODUCTS("Getreideprodukte", 3), MEAT("Fleisch", 4), POTATOES("Kartoffeln", 3),
  SWEETS("Suessigkeiten", 6), VEGETABLES("Gemuese", 2);

  private final String description;
  private final int points;

  FoodCategory(String description, int points) {
    this.description = description;
    this.points = points;
  }

  public String description() {
    return description;
  }

  public int points() {
    return points;
  }

}
