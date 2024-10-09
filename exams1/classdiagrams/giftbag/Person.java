package exams1.classdiagrams.giftbag;

import java.util.Objects;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Person {

  private final int age;
  private final char gender;
  private final String name;

  public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    return age == other.age && gender == other.gender && Objects.equals(name, other.name);
  }

  public int gage() {
    return age;
  }

  public char gender() {
    return gender;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender, name);
  }

  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
  }

}
