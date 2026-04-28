package exams1.classdiagrams.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a zoo that manages a collection of animals.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Zoo {

   private final List<Animal> animals;
   private final String name;

   public Zoo(String name, List<Animal> animals) {
      this.name = name;
      this.animals = animals;
   }

   /** Adds an animal to this zoo. */
   public void addAnimal(Animal animal) {
      animals.add(animal);
   }

   /** Returns the list of all animals in this zoo. */
   public List<Animal> animals() {
      return animals;
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
      Zoo other = (Zoo) obj;
      return Objects.equals(animals, other.animals) && Objects.equals(name, other.name);
   }

   /** Returns the largest animal in this zoo by size. */
   public Animal getBiggestAnimal() {
      double sizeInM = 0;
      Animal animal = null;

      for (Animal a : animals) {
         if (a.sizeInM() > sizeInM) {
            animal = a;
            sizeInM = a.sizeInM();
         }
      }

      return animal;
   }

   /** Returns all fish in this zoo that match the given color. */
   public List<Fish> getFishesByColor(String color) {
      List<Fish> fishes = new ArrayList<>();

      for (Animal a : animals) {
         if (a instanceof Fish f) {
            if (f.color.equals(color)) {
               fishes.add(f);
            }
         }
      }

      return fishes;
   }

   @Override
   public int hashCode() {
      return Objects.hash(animals, name);
   }

   /** Returns the name of this zoo. */
   public String name() {
      return name;
   }

   @Override
   public String toString() {
      return "Zoo [animals=" + animals + ", name=" + name + "]";
   }

}
