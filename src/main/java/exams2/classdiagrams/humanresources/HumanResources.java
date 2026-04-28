package exams2.classdiagrams.humanresources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Represents a human resources system that manages staff members and their telephone numbers.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record HumanResources(Map<TelephoneNumber, Person> telephoneNumbers, List<Person> staff) {

   /**
    * Associates the given telephone number with the specified person.
    */
   public void addTelephoneNumber(TelephoneNumber telephoneNumber, Person person) {
      telephoneNumbers.put(telephoneNumber, person);
   }

   /**
    * Adds the given person to the staff list, throwing an exception if they already exist.
    */
   public void addPerson(Person person) throws DuplicateException {
      for (Person p : staff) {
         if (p.equals(person)) {
            throw new DuplicateException();
         }
      }
      staff.add(person);
   }

   /**
    * Returns all telephone numbers registered for the person with the given ID.
    */
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
