package exams1.activitydiagrams.insertionsort;

import java.util.Random;

/**
 * Insertionsort
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InsertionSort {

   private static int counter;
   private static int[] data;

   public static void main(String[] args) {

      data = new int[1000];

      Random random = new Random();
      for (int i = 0; i < data.length; i++) {
         data[i] = random.nextInt(1, 101);
      }

      sort();

   }

   private static void print() {
      System.out.println("Durchlauf " + counter);
      int i = 0;
      while (i < data.length) {
         System.out.println(data[i]);
         i++;
      }
   }

   private static void sort() {
      int tmp = 0;
      int i = 1;
      while (i < data.length) {
         counter++;
         int j = i;
         tmp = data[j];
         while (j > 0 && data[j - 1] > tmp) {
            data[j] = data[j - 1];
            j--;
         }
         data[j] = tmp;
         print();
         i++;
      }
   }

}
