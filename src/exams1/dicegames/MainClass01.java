package exams1.dicegames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MainClass01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass01 {

  private static List<ShapeSymbolDice> dices;
  private static Player player;
  private static int rounds;
  private static Scanner scanner;

  public static void main(String[] args) {

    dices = new ArrayList<>();
    scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      dices.add(new ShapeSymbolDice());
    }

    System.out.print("Gib bitte Deinen Namen ein: ");
    String name = scanner.nextLine();
    player = new Player(name, 0);

    boolean loop;
    do {
      rounds++;
      System.out.print("Werden mehr als 12 Ecken gewuerfelt?: ");
      boolean tip = scanner.nextBoolean();
      int total = 0;
      for (int i = 0; i < dices.size(); i++) {
        ShapeSymbolDice d = dices.get(i);
        d.rollTheDice();
        ShapeSymbol s = d.getShapeSymbol();
        total += s.corners();
      }
      System.out.println("Es wurden insgesamt " + total + " Ecken gewuerfelt");
      if (total > 12 && tip || total <= 12 && !tip) {
        player.addPoints(1);
        System.out.println("Du hast richtig getippt und bekommst einen Punkt");
      } else {
        System.out.println("Du hast leider falsch getippt und bekommst keinen Punkt");
      }
      System.out.println("Moechtest Du weiterspielen? ");
      loop = scanner.nextBoolean();
    } while (loop);

    System.out.println("Gespielte Runden: " + rounds);
    System.out.println("Erzielte Punkte: " + player.getPoints());

  }

}
