package exams1.classdiagrams.cookiejar;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) throws FileNotFoundException {

    Recipe dough = new Recipe("Spitzbuben-Teig");
    for (Ingredient i : IngredientsReader
        .readIngredients(new File("jappuccini/exams1/cookiejar/spitzbubenteig.txt"))) {
      dough.addIngredient(i);
    }

    Recipe filling = new Recipe("Spitzbuben-Fuellung");
    filling.addIngredient(new Ingredient("Himbeermarmelade"));
    filling.addIngredient(new Ingredient("Johannisbeermarmelade"));

    CookieJar cookieJar = new CookieJar();
    StuffedCookie stuffedCookie = new StuffedCookie("Spitzbuben", dough, filling);
    cookieJar.addCookie(stuffedCookie);
    Cookie cookie = new Cookie("Ausstecherle", dough);
    cookieJar.addCookie(cookie);

    System.out.println("Alle Plaetzchen der Plaetzchendose: " + cookieJar.cookies());
    cookieJar.getStuffedCookie();
    cookieJar.getCookieByName("Ausstecherle");
    System.out.println("Alle Plaetzchen der Plaetzchendose: " + cookieJar.cookies());

  }

}
