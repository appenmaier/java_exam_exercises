package exams1.classdiagrams.studentcourse;

/**
 * Studiengang
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum CourseOfStudies {

  BWL("BWL"), INF("Informatik"), WI("Wirtschaftsinformatik");

  private final String description;

  private CourseOfStudies(String description) {
    this.description = description;
  }

  public String description() {
    return description;
  }

}
