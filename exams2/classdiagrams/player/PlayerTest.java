package exams2.classdiagrams.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * PlayerTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class PlayerTest {

  private Player player;
  private Card zombie;
  private Card vampire;

  @BeforeEach
  void setUp() {
    zombie = new Card("Zombie", 3, 4);
    vampire = new Card("Vampir", 6, 7);
    player = new Player("Hans-Peter", new ArrayList<>(), new HashMap<>());
  }

  @Test
  void testGetMostPowerfulCardByRow() throws CardNotFoundException, NotEnoughActionPointsException {
    player.setActionPoints(9);
    player.getHandCards()
        .add(zombie);
    player.getHandCards()
        .add(vampire);
    player.playCard(zombie, 1);
    player.playCard(vampire, 1);
    assertEquals(Optional.of(vampire), player.getMostPowerfulCardByRow(1));
    assertEquals(Optional.empty(), player.getMostPowerfulCardByRow(2));
  }

  @Test
  void testPlayCard() {
    player.getHandCards()
        .add(zombie);
    assertThrows(CardNotFoundException.class, () -> player.playCard(vampire, 1));
    assertThrows(NotEnoughActionPointsException.class, () -> player.playCard(zombie, 1));
  }

}
