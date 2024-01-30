package exams1.dicegames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MainClass03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass03 {

  private static List<CardColorDice> dices;
  private static List<Player> players;
  private static Scanner scanner;

  public static void main(String[] args) {

    scanner = new Scanner(System.in);

    players = new ArrayList<>();
    System.out.print("Gib bitte die Anzahl Spieler ein: ");
    int numberOfPlayers = scanner.nextInt();
    for (int i = 0; i < numberOfPlayers; i++) {
      System.out.print("Gib Bitte den Namen des naechsten Spielers ein: ");
      String name = scanner.next();
      players.add(new Player(name, 0));
    }
    System.out.println();

    dices = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      dices.add(new CardColorDice());
    }

    for (int i = 0; i < 3; i++) {
      System.out.println("Runde " + (i + 1));
      for (Player p : players) {
        System.out.println(p.name() + " (" + p.getPoints() + ") ist am Zug");
        System.out.print(p.name() + ", gib bitte Deine Farbe (Schwarz, Rot) ein: ");
        String color = scanner.next();
        int numberOfBlacks = 0;
        int numberOfReds = 0;
        for (CardColorDice d : dices) {
          d.rollTheDice();
          switch (d.getCardColor()) {
            case CLUBS -> numberOfBlacks++;
            case SPADE -> numberOfBlacks++;
            case HEARTS -> numberOfReds++;
            case DIAMONDS -> numberOfReds++;
          }
        }
        System.out.println(
            p.name() + " erwuerfelt " + numberOfBlacks + "x Schwarz und " + numberOfReds + "x Rot");
        if (color.equals("Schwarz") && numberOfBlacks > numberOfReds
            || color.equals("Rot") && numberOfReds > numberOfBlacks) {
          int points = Math.abs(numberOfBlacks - numberOfReds);
          p.addPoints(points);
          System.out
              .println(p.name() + " erzielt " + (points > 1 ? points + " Punkte" : "einen Punkt"));
        } else {
          System.out.println(p.name() + " erzielt leider keine Punkte");
        }
        System.out.println();
      }
    }

    int max = 0;
    for (Player p : players) {
      if (p.getPoints() > max) {
        max = p.getPoints();
      }
    }

    for (Player p : players) {
      if (p.getPoints() == max) {
        System.out.println(p.name() + " (" + p.getPoints() + ") gehoert zu den Gewinnern");
      }
    }

  }

}
