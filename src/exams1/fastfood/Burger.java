package exams1.fastfood;

/**
 * Burger
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Burger extends FastFood {

  public Burger(String name, FoodCategory foodCategory, double calories, boolean isVegetarian) {
    super(name, foodCategory, calories, isVegetarian);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Burger [isVegetarian()=" + isVegetarian() + ", ratings()=" + ratings() + ", calories()="
        + calories() + ", foodCategory()=" + foodCategory() + ", name()=" + name() + "]";
  }

}
