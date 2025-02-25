package exams1.dicegames.dicegame14;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   private static ColorDice[] dices;
   private static int winningPoints;
   private static int currentPoints;
   private static int rounds;
   private static Scanner scanner;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);
      dices = new ColorDice[5];
      for (int i = 0; i < dices.length; i++) {
         dices[i] = new ColorDice();
      }
      System.out.print("Bitte Gewinnpunkte eingeben: ");
      winningPoints = scanner.nextInt();

      System.out.println();
      while (currentPoints < winningPoints) {
         rounds++;
         System.out.print("Bitte Farbe (Rot, Grün oder Blau) eingeben: ");
         String color = scanner.next();

         int red = 0;
         int green = 0;
         int blue = 0;
         for (int i = 0; i < dices.length; i++) {
            dices[i].rollTheDice();
            switch (dices[i].getColor()) {
               case RED   -> red += dices[i].getValue();
               case GREEN -> green += dices[i].getValue();
               case BLUE  -> blue += dices[i].getValue();
            }
         }
         System.out.println("Wurfwerte Rot: " + red);
         System.out.println("Wurfwerte Grün: " + green);
         System.out.println("Wurfwerte Blau: " + blue);
         if (red >= green && red >= blue && color.equals("Rot")) {
            currentPoints++;
            System.out.println("Richtig, Du bekommst einen Punkt");
         } else if (green >= red && green >= blue && color.equals("Grün")) {
            currentPoints++;
            System.out.println("Richtig, Du bekommst einen Punkt");
         } else if (blue >= red && blue >= green && color.equals("Blau")) {
            currentPoints++;
            System.out.println("Richtig, Du bekommst einen Punkt");
         } else {
            System.out.println("Leider falsch, Du bekommst leider keinen Punkt");
         }
         System.out.println();
      }
      System.out.println("Du hast " + rounds + " Runden benötigt");
   }

}
