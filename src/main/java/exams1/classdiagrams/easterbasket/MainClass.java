package exams1.classdiagrams.easterbasket;

/**
 * Entry point for the easter basket exercise.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class MainClass {

   /**
    * Demonstrates creating an easter basket with a chicken egg and a confectionery egg.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      Material chocolate = new Material("Schokolade", 2.0);
      Material marzipan = new Material("Marzipan", 3.0);

      EasterBasket basket = new EasterBasket();

      basket.addEgg(new ChickenEgg("Weiß", 55.0));

      ConfectioneryEgg egg = new ConfectioneryEgg("Braun");
      egg.setShell(chocolate, 10);
      egg.setFilling(marzipan, 5);
      basket.addEgg(egg);

      System.out.println("Gesamtgewicht im Korb: " + basket.getTotalWeightInG() + "g");
      System.out.println("Anzahl Genusseier: " + basket.getConfectioneryEggs().size());
   }

}
