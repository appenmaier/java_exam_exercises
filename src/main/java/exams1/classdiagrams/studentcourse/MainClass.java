package exams1.classdiagrams.studentcourse;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) {

      Lecture lecture1 = new Lecture("W3WI_601", "Mathematik I", 5);
      Lecture lecture2 = new Lecture("W3WI_801", "Praxismodul 1", 20);

      Student student1 = new Student(new MatriculationNumber(9, 3, 0, 3, 4, 5, 7), "Hans Maier");
      Student student2 = new Student(new MatriculationNumber(8, 2, 7, 1, 6, 6, 9), "Lisa Schmid");

      StudentCourse studentCourse = new StudentCourse("WWIBEXXX", CourseOfStudies.WI);
      studentCourse.addLecture(lecture1);
      studentCourse.addLecture(lecture2);
      studentCourse.addStudent(student1);
      studentCourse.addStudent(student2);

      System.out.println("Alle Vorlesungen: " + studentCourse.lectures());
      System.out.println("Alle Studenten: " + studentCourse.students());
      System.out.println("Die Vorlesung mit den meisten ECTS-Punkten: "
            + studentCourse.getLectureWithMostCreditPoints());

   }

}
