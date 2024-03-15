package exams1.discountcalculator;

import java.util.Scanner;

/**
 * Rabattrechner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class DiscountCalculator {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean repeat;
    do {
      System.out.print("Bitte Jahresumsatz in Euro eingeben: ");
      double revenuInEuro = scanner.nextDouble();
      System.out.print("Bitte Rechnungsbetrag in Euro eingeben: ");
      double invoiceInEuro = scanner.nextDouble();

      double discount =
          (revenuInEuro > 5000) ? 20 : (revenuInEuro > 1000 && revenuInEuro <= 5000) ? 10 : 0;
      double discountInEuro = invoiceInEuro * discount / 100;
      double invoiceWithDiscountInEuro = invoiceInEuro - discountInEuro;
      System.out.println("Rabattierter Rechnungsbetrag in Euro: " + invoiceWithDiscountInEuro);

      System.out.print("Weitere Berechnung durchfuehren (Ja, Nein)?: ");
      repeat = scanner.next().equals("Ja");
    } while (repeat);

  }

}
