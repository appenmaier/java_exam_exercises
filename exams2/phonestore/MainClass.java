package exams2.phonestore;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {

    PhoneStore phoneStore = new PhoneStore(DataProvider.getPhones());

    System.out.println(phoneStore.query1());
    System.out.println();
    System.out.println(phoneStore.query2());
    System.out.println();
    System.out.println(phoneStore.query3(1000));
    System.out.println();
    System.out.println(phoneStore.query4());
    System.out.println();
    System.out.println(phoneStore.query5());

  }

}
