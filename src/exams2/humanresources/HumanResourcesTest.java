package exams2.humanresources;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * HumanResourcesTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class HumanResourcesTest {

  private HumanResources humanResources;
  private Person maxMaier;
  private TelephoneNumber maxMaierPhoneNumber;
  private Person petraMueller;
  private TelephoneNumber petraMuellerMobilePhoneNumber;
  private TelephoneNumber petraMuellerPhoneNumber;

  @BeforeEach
  void setUp() throws DuplicateException {
    maxMaier = new Person(1, "Max Maier");
    petraMueller = new Person(2, "Petra Mueller");
    petraMuellerPhoneNumber = new TelephoneNumber(new int[] {1, 2, 3, 4, 5});
    petraMuellerMobilePhoneNumber = new TelephoneNumber(new int[] {5, 4, 3, 2, 1});
    maxMaierPhoneNumber = new TelephoneNumber(new int[] {1, 1, 1, 1, 1});
    humanResources = new HumanResources(new HashMap<>(), new ArrayList<Person>());
    humanResources.addPerson(maxMaier);
    humanResources.addTelephoneNumber(petraMuellerPhoneNumber, petraMueller);
    humanResources.addTelephoneNumber(petraMuellerMobilePhoneNumber, petraMueller);
  }

  @Test
  void testAddPerson() throws DuplicateException {
    assertThrows(DuplicateException.class, () -> humanResources.addPerson(maxMaier));

    humanResources.addPerson(petraMueller);
    assertTrue(humanResources.staff().size() == 2);
  }

  @Test
  void testAddTelephoneNumber() {
    humanResources.addTelephoneNumber(maxMaierPhoneNumber, maxMaier);
    assertEquals(maxMaier, humanResources.telephoneNumbers().get(maxMaierPhoneNumber));
  }

  @Test
  void testGetTelephoneNumbersByPersonId() {
    assertEquals(2, humanResources.getTelephoneNumbersByPersonId(2).size());
  }

}
