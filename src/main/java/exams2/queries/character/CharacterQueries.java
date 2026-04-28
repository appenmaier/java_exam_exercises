package exams2.queries.character;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Provides stream-based query operations over a list of game characters.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CharacterQueries(List<Character> characters) {

   /** Returns any character that is an orc hunter, if one exists. */
   public Optional<Character> getAnyOrcHunter() {
      Optional<Character> orcHunter;
      orcHunter = characters.stream()
            .filter(c -> c.race().equals(Race.ORC))
            .filter(c -> c.profession().equals(Profession.HUNTER))
            .findAny();
      return orcHunter;
   }

   /** Returns the number of characters whose name matches the given name exactly. */
   public long getNumberOfCharactersByName(String name) {
      long numberOfCharacters;
      numberOfCharacters = characters.stream().filter(c -> c.name().equals(name)).count();
      return numberOfCharacters;
   }

   /** Returns the average experience points of all mage characters, if any exist. */
   public OptionalDouble getAverageExperiencePointsOfAllMages() {
      OptionalDouble averageExperiencePoints;
      averageExperiencePoints = characters.stream()
            .filter(c -> c.profession().equals(Profession.MAGE))
            .mapToDouble(c -> c.experiencePoints())
            .average();
      return averageExperiencePoints;
   }

   /** Returns a distinct list of character names sorted in reverse alphabetical order. */
   public List<String> getUniqueCharacterNames() {
      List<String> names;
      names = characters.stream()
            .map(c -> c.name())
            .distinct()
            .sorted((n1, n2) -> n2.compareTo(n1))
            .toList();
      return names;
   }

   /** Returns all characters grouped by their race. */
   public Map<Race, List<Character>> getCharactersByRace() {
      Map<Race, List<Character>> professionsByRace;
      professionsByRace = characters.stream().collect(Collectors.groupingBy(c -> c.race()));
      return professionsByRace;
   }

}
