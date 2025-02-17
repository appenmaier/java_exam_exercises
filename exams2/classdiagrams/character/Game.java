package exams2.classdiagrams.character;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Spiel
 * 
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Game(Map<Character, Status> characters) {

   public Status setStatus(Character character, Status newStatus) throws Exception {
      Status oldStatus = characters.get(character);
      if (oldStatus.equals(oldStatus)) {
         throw new Exception();
      }
      characters.put(character, newStatus);
      return oldStatus;
   }

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
