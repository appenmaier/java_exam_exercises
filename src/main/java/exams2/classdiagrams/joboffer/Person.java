package exams2.classdiagrams.joboffer;

import java.util.Objects;

/**
 * Abstract base class representing a person with a name and birth date timestamp.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Person {

   private final long birthDateTimeStamp;
   private final String name;

   public Person(String name, long birthDateTimeStamp) {
      this.name = name;
      this.birthDateTimeStamp = birthDateTimeStamp;
   }

   /**
    * Returns the birth date of this person as a Unix timestamp.
    */
   public long birthDateTimeStamp() {
      return birthDateTimeStamp;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Person other = (Person) obj;
      return birthDateTimeStamp == other.birthDateTimeStamp && Objects.equals(name, other.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(birthDateTimeStamp, name);
   }

   /**
    * Returns the name of this person.
    */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Person [name=" + name + ", birthDateTimeStamp=" + birthDateTimeStamp + "]";
   }

}
