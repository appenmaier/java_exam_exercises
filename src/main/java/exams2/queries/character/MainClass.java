package exams2.queries.character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static List<Character> getAvatars(int number) {
      String[] prefixes = {"Doom ", "Demon ", "Hell ", "Peace ", "Water ", "Fire "};
      String[] suffixes = {"Hammer", "Bringer", "Finder", "Walker", "Hunter"};

      List<Character> avatars = new ArrayList<>();
      Random random = new Random();
      for (int i = 0; i < number; i++) {
         String name = prefixes[random.nextInt(prefixes.length)]
               + suffixes[random.nextInt(suffixes.length)];
         Race race = Race.values()[random.nextInt(Race.values().length)];
         Profession profession = Profession.values()[random.nextInt(Profession.values().length)];
         int level = random.nextInt(5, 50);
         int ex = random.nextInt(100, 1000);

         avatars.add(new Character(name, race, profession, level, ex));
      }
      return avatars;
   }

   public static void main(String[] args) {
      CharacterQueries queries = new CharacterQueries(getAvatars(25));
      Collections.sort(queries.characters());

      queries.characters().forEach(System.out::println);
      System.out.println();

      queries.getAnyOrcHunter().ifPresent(System.out::println);
      System.out.println();

      System.out.println(queries.getUniqueCharacterNames());
      System.out.println();

      System.out.println(queries.getNumberOfCharactersByName("Demon Bringer"));
      System.out.println();

      queries.getAverageExperiencePointsOfAllMages().ifPresent(System.out::println);
      System.out.println();

      System.out.println(queries.getCharactersByRace());
   }

}
