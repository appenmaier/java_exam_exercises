package exams2.classdiagrams.humanresources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Personalverwaltung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record HumanResources(Map<TelephoneNumber, Person> telephoneNumbers, List<Person> staff) {

   public void addTelephoneNumber(TelephoneNumber telephoneNumber, Person person) {
      telephoneNumbers.put(telephoneNumber, person);
   }

   public void addPerson(Person person) throws DuplicateException {
      for (Person p : staff) {
         if (p.equals(person)) {
            throw new DuplicateException();
         }
      }
      staff.add(person);
   }

   public List<TelephoneNumber> getTelephoneNumbersByPersonId(int id) {
      List<TelephoneNumber> numbers = new ArrayList<>();
      for (Entry<TelephoneNumber, Person> entry : telephoneNumbers.entrySet()) {
         if (entry.getValue().id() == id) {
            numbers.add(entry.getKey());
         }
      }
      return numbers;
   }

}
