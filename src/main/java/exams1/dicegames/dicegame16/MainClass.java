package exams1.dicegames.dicegame16;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static Scanner scanner;
   private static SymbolDice[] dices;
   private static int points;
   private static int rounds;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Gib bitte die Anzahl Totenköpfe pro Würfel ein: ");
      int skulls = scanner.nextInt();

      System.out.print("Gib bitte die Anzahl Herzen pro Würfel ein: ");
      int hearts = scanner.nextInt();

      System.out.print("Gib bitte die Anzahl Würfel ein: ");
      int numberOfDices = scanner.nextInt();

      dices = new SymbolDice[numberOfDices];
      for (int i = 0; i < numberOfDices; i++) {
         SymbolDice dice = new SymbolDice(skulls, hearts);
         dices[i] = dice;
      }
      System.out.println();
      while (true) {
         rounds++;

         skulls = 0;
         hearts = 0;
         for (SymbolDice d : dices) {
            d.rollTheDice();
            if (d.getSymbol().equals(Symbol.SKULL)) {
               skulls++;
            } else {
               hearts++;
            }
         }
         System.out.println("Runde: " + rounds);
         System.out.println("Totenköpfe: " + skulls);
         System.out.println("Herzen: " + hearts);
         if (skulls > hearts) {
            int damage = skulls - hearts;
            points -= damage;
            System.out.println("Schaden: " + damage);
         } else {
            int healing = hearts - skulls;
            points += healing;
            System.out.println("Heilung: " + healing);
         }
         System.out.println("Punkte: " + points);

         System.out.print("Nochmal?: ");
         if (scanner.nextBoolean() == false) {
            break;
         }
         System.out.println();
      }
   }

}
