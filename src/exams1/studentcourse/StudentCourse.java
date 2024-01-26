package exams1.studentcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Kurs
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StudentCourse {

  private final CourseOfStudies courseOfStudies;
  private final String description;
  private final List<Lecture> lectures;
  private final List<Student> students;

  public StudentCourse(String description, CourseOfStudies courseOfStudies) {
    this.description = description;
    this.courseOfStudies = courseOfStudies;
    this.lectures = new ArrayList<>();
    students = new ArrayList<>();
  }

  public void addLecture(Lecture lecture) {
    lectures.add(lecture);
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public CourseOfStudies courseOfStudies() {
    return courseOfStudies;
  }

  public String description() {
    return description;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    StudentCourse other = (StudentCourse) obj;
    return courseOfStudies == other.courseOfStudies
        && Objects.equals(description, other.description)
        && Objects.equals(lectures, other.lectures) && Objects.equals(students, other.students);
  }

  public Lecture getLectureWithMostCreditPoints() {
    Lecture lecture = lectures.get(0);
    int creditPoints = lecture.creditPoints();
    for (int i = 0; i < lectures.size(); i++) {
      if (lectures.get(i).creditPoints() > creditPoints) {
        lecture = lectures.get(i);
        creditPoints = lecture.creditPoints();
      }
    }
    return lecture;
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseOfStudies, description, lectures, students);
  }

  public List<Lecture> lectures() {
    return lectures;
  }

  public List<Student> students() {
    return students;
  }

  @Override
  public String toString() {
    return "StudentCourse [courseOfStudies=" + courseOfStudies + ", description=" + description
        + ", lectures=" + lectures + ", students=" + students + "]";
  }

}
