package exams1.activitydiagrams.cashmachine;

import java.util.Scanner;

/**
 * Geldautomat
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CashMachine {

   @SuppressWarnings("resource")
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      boolean repeat;

      repeat = false;
      do {
         System.out.print("Bitte Kontonummer eingeben: ");
         String accountNumber = scanner.next();
         System.out.print("Bitte PIN eingeben: ");
         String pin = scanner.next();
         boolean loginDataIsValid = AccountStub.checkLoginData(accountNumber, pin);
         if (loginDataIsValid) {
            repeat = false;
         } else {
            System.out.println("Logindaten sind ungültig");
            repeat = true;
         }
      } while (repeat);

      repeat = true;
      while (repeat) {
         System.out.print(
               "Bitte Auswahl treffen\n1: Kontostand anzeigen\n2: Geld abheben\n3: Beenden: ");
         int option = scanner.nextInt();
         if (option == 1) {
            AccountStub.showAccountBalance();
         } else if (option == 2) {
            System.out.print("Bitte Betrag in Euro eingeben: ");
            double amountInEuro = scanner.nextDouble();
            boolean transactionIsPossible = AccountStub.checkAccountBalance(amountInEuro);
            if (transactionIsPossible) {
               AccountStub.payOffMoney(amountInEuro);
            } else {
               System.out.println("Kontostand ist zu niedrig");
            }
         } else {
            repeat = false;
         }
      }

   }

}
