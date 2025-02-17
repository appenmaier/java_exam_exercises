package exams2.queries.character;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * CharacterQueries
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record CharacterQueries(List<Character> characters) {

   public Optional<Character> getAnyOrcHunter() {
      Optional<Character> orcHunter;
      orcHunter = characters.stream()
            .filter(c -> c.race().equals(Race.ORC))
            .filter(c -> c.profession().equals(Profession.HUNTER))
            .findAny();
      return orcHunter;
   }

   public long getNumberOfCharactersByName(String name) {
      long numberOfCharacters;
      numberOfCharacters = characters.stream().filter(c -> c.name().equals(name)).count();
      return numberOfCharacters;
   }

   public OptionalDouble getAverageExperiencePointsOfAllMages() {
      OptionalDouble averageExperiencePoints;
      averageExperiencePoints = characters.stream()
            .filter(c -> c.profession().equals(Profession.MAGE))
            .mapToDouble(c -> c.experiencePoints())
            .average();
      return averageExperiencePoints;
   }

   public List<String> getUniqueCharacterNames() {
      List<String> names;
      names = characters.stream()
            .map(c -> c.name())
            .distinct()
            .sorted((n1, n2) -> n2.compareTo(n1))
            .toList();
      return names;
   }

   public Map<Race, List<Character>> getCharactersByRace() {
      Map<Race, List<Character>> professionsByRace;
      professionsByRace = characters.stream().collect(Collectors.groupingBy(c -> c.race()));
      return professionsByRace;
   }

}
