package exams1.classdiagrams.studentcourse;

/**
 * Represents a course of studies with a human-readable description.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum CourseOfStudies {

   BWL("BWL"), INF("Informatik"), WI("Wirtschaftsinformatik");

   private final String description;

   /**
    * Creates a course of studies enum constant with the given description.
    *
    * @param description the human-readable name of the course of studies
    */
   private CourseOfStudies(String description) {
      this.description = description;
   }

   /** Returns the human-readable description of this course of studies. */
   public String description() {
      return description;
   }

}
