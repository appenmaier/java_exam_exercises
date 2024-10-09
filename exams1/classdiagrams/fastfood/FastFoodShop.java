package exams1.classdiagrams.fastfood;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Fast-Food-Laden
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FastFoodShop {

  private List<FastFood> fastFood;
  private String name;

  public FastFoodShop(String name) {
    this.name = name;
    fastFood = new ArrayList<>();
  }

  public void addFastFood(FastFood fastFood) {
    this.fastFood.add(fastFood);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    FastFoodShop other = (FastFoodShop) obj;
    return Objects.equals(fastFood, other.fastFood) && Objects.equals(name, other.name);
  }

  public List<FastFood> fastFood() {
    return fastFood;
  }

  public Burger getBestRatedBurger() {
    Burger bestRatedBurger = null;
    double bestRating = 0;

    for (FastFood f : fastFood) {
      if (f instanceof Burger b && b.getAverageRating() > bestRating) {
        bestRating = b.getAverageRating();
        bestRatedBurger = b;
      }
    }
    return bestRatedBurger;
  }

  @Override
  public int hashCode() {
    return Objects.hash(fastFood, name);
  }

  public String name() {
    return name;
  }

  public void rateFastFood(FastFood fastFood, int rating) {
    fastFood.addRating(rating);
  }

  @Override
  public String toString() {
    return "FastFoodShop [fastFood=" + fastFood + ", name=" + name + "]";
  }

}
