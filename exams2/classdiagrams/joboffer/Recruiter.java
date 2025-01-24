package exams2.classdiagrams.joboffer;

/**
 * Recruiter
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class Recruiter extends Person {

   public Recruiter(String name, long birthDateTimeStamp) {
      super(name, birthDateTimeStamp);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      return true;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return "Recruiter [birthDateTimeStamp()=" + birthDateTimeStamp() + ", name()=" + name() + "]";
   }

}
