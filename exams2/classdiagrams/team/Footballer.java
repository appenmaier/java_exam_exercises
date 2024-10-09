package exams2.classdiagrams.team;

import java.util.Objects;

/**
 * Fussballer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class Footballer extends Sportsman {

  private int numberOfGoals;
  private int numberOfAssists;

  public Footballer(String name, int numberOfGoals, int numberOfAssists) {
    super(name);
    this.numberOfGoals = numberOfGoals;
    this.numberOfAssists = numberOfAssists;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Footballer other = (Footballer) obj;
    return numberOfAssists == other.numberOfAssists && numberOfGoals == other.numberOfGoals;
  }

  @Override
  public int getScorerPoints() {
    return numberOfGoals + numberOfAssists;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(numberOfAssists, numberOfGoals);
    return result;
  }

  public int numberOfAssitss() {
    return numberOfAssists;
  }

  public int numberOfGoals() {
    return numberOfGoals;
  }

  @Override
  public String toString() {
    return "Footballer [numberOfGoals=" + numberOfGoals + ", numberOfAssists=" + numberOfAssists
        + ", name()=" + name() + "]";
  }

}
