package exams1.classdiagrams.studentcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a student course belonging to a course of studies, holding a list of lectures and enrolled students.
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

   /** Adds a lecture to this student course. */
   public void addLecture(Lecture lecture) {
      lectures.add(lecture);
   }

   /** Adds a student to this student course. */
   public void addStudent(Student student) {
      students.add(student);
   }

   /** Returns the course of studies this student course belongs to. */
   public CourseOfStudies courseOfStudies() {
      return courseOfStudies;
   }

   /** Returns the description of this student course. */
   public String description() {
      return description;
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
      StudentCourse other = (StudentCourse) obj;
      return courseOfStudies == other.courseOfStudies
            && Objects.equals(description, other.description)
            && Objects.equals(lectures, other.lectures) && Objects.equals(students, other.students);
   }

   /** Returns the lecture with the highest number of credit points. */
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

   /** Returns the list of lectures in this student course. */
   public List<Lecture> lectures() {
      return lectures;
   }

   /** Returns the list of students enrolled in this student course. */
   public List<Student> students() {
      return students;
   }

   @Override
   public String toString() {
      return "StudentCourse [courseOfStudies=" + courseOfStudies + ", description=" + description
            + ", lectures=" + lectures + ", students=" + students + "]";
   }

}
