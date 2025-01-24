package exams1.activitydiagrams.cashmachine;

public class AccountStub {

   private static double accountBalanceInEuro = 999.99;
   private static String accountNumber = "12345";
   private static String pin = "0000";

   public static boolean checkAccountBalance(double amountInEuro) {
      return accountBalanceInEuro > amountInEuro;
   }

   public static boolean checkLoginData(String accountNumber, String pin) {
      return AccountStub.accountNumber.equals(accountNumber) && AccountStub.pin.equals(pin);
   }

   public static void payOffMoney(double amountInEuro) {
      accountBalanceInEuro -= amountInEuro;
   }

   public static void showAccountBalance() {
      System.out.println("Kontostand: " + accountBalanceInEuro + " Euro");
   }

}
