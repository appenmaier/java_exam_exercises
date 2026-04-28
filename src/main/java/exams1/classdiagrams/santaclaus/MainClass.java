package exams1.classdiagrams.santaclaus;

/**
 * Demonstrates Santa Claus adding and wrapping presents, then counting toys.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {
      SantaClaus santa = new SantaClaus();

      santa.addPresent(new Toy("Elektrische Eisenbahn", 199));
      santa.addPresent(new Book("Es", "Stephen King"));

      santa.wrapAllPresents();

      System.out.println("Anzahl Spielzeuge: " + santa.getNumberOfToys());
   }

}
