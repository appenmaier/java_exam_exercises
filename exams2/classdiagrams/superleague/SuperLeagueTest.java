package exams2.classdiagrams.superleague;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * SuperLeagueTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SuperLeagueTest {

   private SuperLeague<Hero> avengers;
   private Hero superman;
   private Hero ironman;
   private Hero spiderman;

   @BeforeEach
   void setUp() {
      superman = new Hero("Superman", Universe.DC, 9);
      ironman = new Hero("Iron Man", Universe.MARVEL, 7);
      spiderman = new Hero("Spider-Man", Universe.MARVEL, 8);
      avengers = new SuperLeague<>("Avengers", Universe.MARVEL, new HashMap<>());
      avengers.members().put(ironman, true);
      avengers.members().put(spiderman, false);
   }

   @Test
   void testAddSuperHuman() {
      assertThrows(WrongUniverseException.class, () -> avengers.addSuperHuman(superman));
   }

   @Test
   void testGetAllAvailableSuperHumans() {
      List<Hero> heroes = avengers.getAllAvailableSuperHumans();
      assertEquals(1, heroes.size());
   }

   @Test
   void testGetMostPowerfulSuperHuman() {
      assertEquals(Optional.of(spiderman), avengers.getMostPowerfulSuperHuman());
   }

}
