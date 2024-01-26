package exams1.cookiejar;

import java.util.List;
import java.util.Objects;

/**
 * Gefuelltes Plaetzchen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StuffedCookie extends Cookie {

  private final Recipe jam;

  public StuffedCookie(String name, Recipe dough, Recipe jam) {
    super(name, dough);
    this.jam = jam;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    StuffedCookie other = (StuffedCookie) obj;
    return Objects.equals(jam, other.jam);
  }

  @Override
  public List<Ingredient> getIngredients() {
    List<Ingredient> ingredients = super.getIngredients();
    for (int i = 0; i < jam.ingredients().size(); i++) {
      Ingredient ingredient = jam.ingredients().get(i);
      if (ingredients.contains(ingredient)) {
        continue;
      }
      ingredients.add(ingredient);
    }
    return ingredients;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(jam);
    return result;
  }

  @Override
  public String toString() {
    return "StuffedCookie [jam=" + jam + ", dough()=" + dough() + ", name()=" + name() + "]";
  }

}
