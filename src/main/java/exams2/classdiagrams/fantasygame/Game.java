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
