package exams1.classdiagrams.giftbag;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {

    GiftBag giftBag = new GiftBag();

    Person person1 = new Person("Hans", 21, 'm');
    Person person2 = new Person("Lisa", 19, 'w');

    Present present1 = new Present("PS5", 499, person1, person2);
    Present present2 = new Present("XBox Series S", 259, person1, person2);

    giftBag.addPresent(present1);
    giftBag.addPresent(present2);

    System.out.println("Alle Geschenke: " + giftBag.presents());
    System.out.println("Das teuerste Geschenk: " + giftBag.getMostExpensivePresent());

  }

}
