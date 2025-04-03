package exams1.activitydiagrams.selectionsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Selectionsort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SelectionSort {

   private static List<Integer> data;

   public static void main(String[] args) {

      data = new ArrayList<>();

      Random random = new Random();
      for (int i = 0; i < 1000; i++) {
         data.add(random.nextInt(1, 101));
      }

      System.out.println(data);
      sort();
      System.out.println(data);

   }

   private static void sort() {
      int i = 0;
      while (i < data.size() - 1) {
         int index = i;
         int j = i + 1;
         while (j < data.size()) {
            if (data.get(j) < data.get(index)) {
               index = j;
            }
            j++;
         }
         int tmp = data.get(index);
         data.set(index, data.get(i));
         data.set(i, tmp);
         i++;
      }
   }

}
