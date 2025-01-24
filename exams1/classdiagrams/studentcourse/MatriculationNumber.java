package exams1.classdiagrams.studentcourse;

import java.util.Arrays;

/**
 * Matrikelnummer
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MatriculationNumber {

   private final int[] digits;

   public MatriculationNumber(int digit1, int digit2, int digit3, int digit4, int digit5,
         int digit6, int digit7) {
      digits = new int[7];
      digits[0] = digit1;
      digits[1] = digit2;
      digits[2] = digit3;
      digits[3] = digit4;
      digits[4] = digit5;
      digits[5] = digit6;
      digits[6] = digit7;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      MatriculationNumber other = (MatriculationNumber) obj;
      return Arrays.equals(digits, other.digits);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + Arrays.hashCode(digits);
      return result;
   }

   @Override
   public String toString() {
      String n = "";
      for (int i : digits) {
         n += i;
      }
      return n;
   }

}
