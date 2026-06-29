package exams2.classdiagrams.fantasygame;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents the fantasy game state, tracking characters and their current status.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Game(Map<Character, Status> characters) {

   /**
    * Updates the status of the given character and returns the previous status, or throws an exception if the status is unchanged.
    *
    * @param character the character whose status is to be updated
    * @param newStatus the new status to assign
    * @return the previous status of the character
    * @throws Exception if the new status is the same as the current status
    */
   public Status setStatus(Character character, Status newStatus) throws Exception {
      Status oldStatus = characters.get(character);
      if (oldStatus.equals(newStatus)) {
         throw new Exception();
      }
      characters.put(character, newStatus);
      return oldStatus;
   }

   /**
    * Returns the first character found with the given status, if any.
    *
    * @param status the status to search for
    * @return an {@link java.util.Optional} containing the matching character, or empty if not found
    */
   public Optional<Character> getCharacterByStatus(Status status) {
      for (Entry<Character, Status> entry : characters.entrySet()) {
         Character c = entry.getKey();
         Status s = entry.getValue();
         if (s.equals(status)) {
            return Optional.ofNullable(c);
         }
      }
      return Optional.empty();
   }

}
