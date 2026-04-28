package exams1.activitydiagrams.cashmachine;

/**
 * Stub implementation of a bank account used to simulate account operations in the cash machine.
 */
public class AccountStub {

   private static double accountBalanceInEuro = 999.99;
   private static String accountNumber = "12345";
   private static String pin = "0000";

   /** Checks whether the account balance is sufficient for the requested amount. */
   public static boolean checkAccountBalance(double amountInEuro) {
      return accountBalanceInEuro > amountInEuro;
   }

   /** Verifies that the given account number and PIN match the stored credentials. */
   public static boolean checkLoginData(String accountNumber, String pin) {
      return AccountStub.accountNumber.equals(accountNumber) && AccountStub.pin.equals(pin);
   }

   /** Deducts the specified amount from the account balance. */
   public static void payOffMoney(double amountInEuro) {
      accountBalanceInEuro -= amountInEuro;
   }

   /** Prints the current account balance to standard output. */
   public static void showAccountBalance() {
      System.out.println("Kontostand: " + accountBalanceInEuro + " Euro");
   }

}
