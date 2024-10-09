package exams2.classdiagrams.legobrick;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * LegoBrickVolumeComparatorTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LegoBrickVolumeComparatorTest {

  @Test
  void testCompare() {
    LegoBrickVolumeComparator comparator = new LegoBrickVolumeComparator();
    LegoBrick brick1 = new LegoBrick2x2x2(1, "rot");
    LegoBrick brick2 = new LegoBrick4x2x1(2, "blau");

    assertTrue(comparator.compare(brick1, brick2) == 0);
  }

}
