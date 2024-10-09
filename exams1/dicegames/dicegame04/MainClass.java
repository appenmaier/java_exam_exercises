package exams1.dicegames.dicegame04;

import java.util.Scanner;

public class MainClass {

  private static Player player1;
  private static Player player2;
  private static Scanner scanner;
  private static FoodCategoryDice foodCategoryDice;
  private static AmountDice amountDice;
  private static int rounds;

  public static void main(String[] args) {

    scanner = new Scanner(System.in);

    System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
    String name1 = scanner.nextLine();
    System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
    String name2 = scanner.nextLine();

    player1 = new Player(name1);
    player2 = new Player(name2);

    player1.setPoints(100);
    player2.setPoints(100);

    foodCategoryDice = new FoodCategoryDice();
    amountDice = new AmountDice();

    while (player1.getPoints() > 0 && player2.getPoints() > 0) {
      rounds++;
      System.out.println("Runde " + rounds);
      System.out.println(player1.name() + " hat " + player1.getPoints() + " Punkte, "
          + player2.name() + " hat " + player2.getPoints() + " Punkte");

      FoodCategory foodCategory1 = foodCategoryDice.rollTheDice();
      int amount1 = amountDice.rollTheDice();
      int value1 = foodCategory1.points() * amount1;
      System.out.println(player1.name() + " wuerfelt " + amount1 + " x "
          + foodCategory1.description() + " (" + value1 + " Punkte)");

      FoodCategory foodCategory2 = foodCategoryDice.rollTheDice();
      int amount2 = amountDice.rollTheDice();
      int value2 = foodCategory2.points() * amount2;
      System.out.println(player2.name() + " wuerfelt " + amount2 + " x "
          + foodCategory2.description() + " (" + value2 + " Punkte)");

      int difference;
      if (value1 > value2) {
        difference = value1 - value2;
        player2.setPoints(player2.getPoints() - difference);
        System.out.println(player2.name() + " werden " + difference + " Punkte abgezogen");
      } else if (value2 > value1) {
        difference = value2 - value1;
        player1.setPoints(player1.getPoints() - difference);
        System.out.println(player1.name() + " werden " + difference + " Punkte abgezogen");
      }

      System.out.println();
    }

    if (player1.getPoints() > player2.getPoints()) {
      System.out.println(player1.name() + " hat gewonnen");
    } else {
      System.out.println(player2.name() + " hat gewonnen");
    }

  }

}
