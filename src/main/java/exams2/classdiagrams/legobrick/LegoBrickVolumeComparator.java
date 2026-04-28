package exams2.classdiagrams.legobrick;

import java.util.Comparator;

/**
 * Comparator that orders Lego bricks by their volume in ascending order.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LegoBrickVolumeComparator implements Comparator<LegoBrick> {

   /** Compares two Lego bricks by their volume (width × depth × height). */
   @Override
   public int compare(LegoBrick legoBrick1, LegoBrick legoBrick2) {
      int[] dimensionsLegoBrick1 = legoBrick1.getDimensions();
      int[] dimensionsLegoBrick2 = legoBrick2.getDimensions();
      Integer volumeLegoBrick1 =
            dimensionsLegoBrick1[0] * dimensionsLegoBrick1[1] * dimensionsLegoBrick1[2];
      Integer volumeLegoBrick2 =
            dimensionsLegoBrick2[0] * dimensionsLegoBrick2[1] * dimensionsLegoBrick2[2];
      return volumeLegoBrick1.compareTo(volumeLegoBrick2);
   }

}
