package exams2.classdiagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import exams2.classdiagrams.fantasygame.Character;
import exams2.classdiagrams.fantasygame.Game;
import exams2.classdiagrams.fantasygame.Profession;
import exams2.classdiagrams.fantasygame.Race;
import exams2.classdiagrams.fantasygame.Status;

/**
 * CharacterAndGameTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CharacterAndGameTest {

   private static Character balin;
   private static Character snagagor;
   private static Character valyon;
   private static Game game;

   @BeforeAll
   static void setUp() {
      balin = new Character("Balin", Race.DWARF, Profession.HUNTER, 2, 50);
      snagagor = new Character("Snagagor", Race.ORC, Profession.WARRIOR, 1, 100);
      valyon = new Character("Valyon", Race.HUMAN, Profession.MAGE, 2, 25);
      game = new Game(new HashMap<>());
   }

   @Test
   void testCompareTo() {
      assertTrue(balin.compareTo(valyon) < 0);
      assertTrue(balin.compareTo(snagagor) < 0);
   }

   @Test
   void testGetCharacter() {
      game.characters().put(balin, Status.STUN);
      game.characters().put(snagagor, Status.BLEED);
      assertEquals(Optional.ofNullable(snagagor), game.getCharacterByStatus(Status.BLEED));
      assertEquals(Optional.empty(), game.getCharacterByStatus(Status.DISORIENTED));
   }

}
