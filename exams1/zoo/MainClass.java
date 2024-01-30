package exams1.zoo;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {

    Zoo zoo = new Zoo("Berliner Tierpark");

    zoo.addAnimal(new Mammal("Tiger", 2.5, 140));
    zoo.addAnimal(new Bird("Weisskopfseeadler", 0.9, 3.7));
    zoo.addAnimal(new Fish("Clownfish", 0.16, 0.25, "orange"));
    zoo.addAnimal(new Fish("Goldfisch", 0.35, 0.4, "orange"));
    zoo.addAnimal(new Fish("Hammerhai", 3.5, 230, "grau"));

    System.out.println("Alle Tiere: " + zoo.animals());
    System.out.println("Das groesste Tier: " + zoo.getBiggestAnimal());
    System.out.println("Alle orangenen Fische: " + zoo.getFishesByColor("orange"));

  }

}
