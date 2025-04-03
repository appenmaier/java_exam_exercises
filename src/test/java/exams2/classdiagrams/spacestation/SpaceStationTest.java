package exams2.classdiagrams.spacestation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * SpaceStationTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SpaceStationTest {

   private static SpaceFighter sf1;
   private static SpaceFighter sf2;
   private static SpaceFighter sf3;
   private static SpaceStation spaceStation;

   @BeforeEach
   void setUp() {
      sf1 = new SpaceFighter("SF-1", Type.A_WING);
      sf2 = new SpaceFighter("SF-2", Type.X_WING);
      sf3 = new SpaceFighter("SF-3", Type.B_WING);
      HashMap<Integer, SpaceFighter> bays = new HashMap<>();
      bays.put(1, sf1);
      bays.put(2, sf2);
      bays.put(3, null);
      spaceStation = new SpaceStation("SpaceStation X", bays);
   }

   @Test
   void testGetFastestSpaceFighter() {
      assertEquals(Optional.of(sf1), spaceStation.getFastestSpaceFighter());
   }

   @Test
   void testLand() {
      assertThrows(BayAlreadyLoadedException.class, () -> spaceStation.land(sf3, 1));
      assertThrows(SpaceFighterAlreadyLandedException.class, () -> spaceStation.land(sf1, 3));
   }

}
