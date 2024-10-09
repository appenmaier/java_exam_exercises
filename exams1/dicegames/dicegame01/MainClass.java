package exams1.dicegames.dicegame01;

import java.util.Scanner;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  private static Player player1;
  private static Player player2;
  private static Scanner scanner;
  private static WeaponDice weaponDice;

  public static void main(String[] args) {
    scanner = new Scanner(System.in);

    System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
    String name1 = scanner.nextLine();
    player1 = new Player(name1, 10);

    System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
    String name2 = scanner.nextLine();
    player2 = new Player(name2, 10);

    weaponDice = new WeaponDice();

    System.out.println();

    while (player1.getPoints() > 0 && player2.getPoints() > 0) {
      System.out.println("Punkte " + player1.name() + ": " + player1.getPoints());
      System.out.println("Punkte " + player2.name() + ": " + player2.getPoints());

      weaponDice.rollTheDice();
      int total1 = weaponDice.getWeapon().power();
      System.out.println("Waffen-Symbol " + player1.name() + ": " + weaponDice.getWeapon().description());
      weaponDice.rollTheDice();
      int total2 = weaponDice.getWeapon().power();
      System.out.println("Waffen-Symbol " + player2.name() + ": " + weaponDice.getWeapon().description());

      if (total1 > total2) {
        player2.reducePoints(total1 - total2);
        System.out.println("Punkte " + player2.name() + ": " + player2.getPoints());
      } else if (total2 > total1) {
        player1.reducePoints(total2 - total1);
        System.out.println("Punkte " + player1.name() + ": " + player1.getPoints());
      }
      System.out.println();
    }

    if (player1.getPoints() > player2.getPoints()) {
      System.out.println(player1.name() + " gewinnt");
    } else {
      System.out.println(player2.name() + " gewinnt");
    }

  }

}
