package exams2.classdiagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exams2.classdiagrams.team.Footballer;
import exams2.classdiagrams.team.Position;
import exams2.classdiagrams.team.Team;

/**
 * TeamTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TeamTest {

   private Footballer alexandraPopp;
   private Team<Footballer> dfbWomen;
   private Footballer leaSchueller;
   private Footballer melanieLeupolz;

   @BeforeEach
   void setUp() {
      dfbWomen = new Team<>("DFB Frauen-Nationalmannschaft", new HashMap<>());
      alexandraPopp = new Footballer("Alexandra Popp", 129, 64);
      melanieLeupolz = new Footballer("Melanie Leupolz", 79, 13);
      leaSchueller = new Footballer("Lea Schueller", 48, 32);
      dfbWomen.members().put(alexandraPopp, Position.STRIKER);
      dfbWomen.members().put(melanieLeupolz, Position.MIDFIELDER);
      dfbWomen.members().put(leaSchueller, Position.STRIKER);
   }

   @Test
   void testAddTeamMember() {
      assertThrows(Exception.class, () -> dfbWomen.addTeamMember(alexandraPopp, Position.STRIKER));
   }

   @Test
   void testGetAllTeamMembersByPositio() {
      assertEquals(2, dfbWomen.getAllTeamMembersByPosition(Position.STRIKER).size());
   }

   @Test
   void testGetBestScorer() {
      assertEquals(alexandraPopp, dfbWomen.getBestScorer().get());
   }

}
