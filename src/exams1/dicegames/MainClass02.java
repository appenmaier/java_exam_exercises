package exams1.dicegames;

import java.util.Scanner;

/**
 * MainClass02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass02 {

  private static Player player1;
  private static Player player2;
  private static Scanner scanner;
  private static ShapeSymbolDice shapeSymbolDice;
  private static ValueDice valueDice;

  public static void main(String[] args) {

    shapeSymbolDice = new ShapeSymbolDice();
    valueDice = new ValueDice();
    scanner = new Scanner(System.in);

    System.out.print("Spieler 1, gib bitte Deinen Namen ein: ");
    String name1 = scanner.nextLine();
    System.out.print("Spieler 2, gib bitte Deinen Namen ein: ");
    String name2 = scanner.nextLine();
    player1 = new Player(name1, 100);
    player2 = new Player(name2, 100);
    System.out.println();

    while (player1.getPoints() > 0 && player2.getPoints() > 0) {
      System.out.println("Punkte von " + player1.name() + ": " + player1.getPoints());
      System.out.println("Punkte von " + player2.name() + ": " + player2.getPoints());

      shapeSymbolDice.rollTheDice();
      valueDice.rollTheDice();
      ShapeSymbol shapeSymbol1 = shapeSymbolDice.getShapeSymbol();
      int value1 = valueDice.getValue();
      int points1 = value1 * shapeSymbol1.corners();
      System.out.println(player1.name() + " erwuerfelt " + points1 + " Punkte");

      shapeSymbolDice.rollTheDice();
      valueDice.rollTheDice();
      ShapeSymbol shapeSymbol2 = shapeSymbolDice.getShapeSymbol();
      int value2 = valueDice.getValue();
      int points2 = value2 * shapeSymbol2.corners();
      System.out.println(player2.name() + " erwuerfelt " + points2 + " Punkte");

      if (points1 > points2) {
        System.out.println(player2.name() + " verliert " + (points1 - points2) + " Punkte");
        player2.deductPoints(points1 - points2);
      } else if (points2 > points1) {
        System.out.println(player1.name() + " verliert " + (points2 - points1) + " Punkte");
        player1.deductPoints(points2 - points1);
      }
      System.out.println();
    }

    System.out.println(player1.getPoints() > player2.getPoints() ? player1.name() + " gewinnt"
        : player2.name() + " gewinnt");

  }

}
