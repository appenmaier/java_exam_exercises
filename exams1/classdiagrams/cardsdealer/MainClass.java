package exams1.classdiagrams.cardsdealer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) throws FileNotFoundException {

    Player player1 = new Player();
    Player player2 = new Player();

    List<Card> deck = CardsReader.getCards(new File("jappuccini/exams1/cardsdealer/cards.txt"));
    CardsDealer cardsDealer = new CardsDealer(deck, player1, player2);

    cardsDealer.dealCards(5);

    System.out.println("Kartenstapel: " + deck);
    System.out.println("Karten von Spieler 1: " + player1.cards());
    System.out.println("Karten von Spieler 2: " + player2.cards());
    System.out.println("Alle Kreuzkarten von Spieler 1: " + player1.getCardsByColour("Kreuz"));
    System.out.println("Die hoechste Karte von Spieler 2: " + player2.getCardWithHighestValue());

  }

}
