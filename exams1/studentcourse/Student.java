package exams1.studentcourse;

import java.util.Objects;

/**
 * Studierender
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Student {

  private final MatriculationNumber matriculationNumber;
  private final String name;

  public Student(MatriculationNumber matriculationNumber, String name) {
    this.matriculationNumber = matriculationNumber;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    return Objects.equals(matriculationNumber, other.matriculationNumber)
        && Objects.equals(name, other.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matriculationNumber, name);
  }

  public MatriculationNumber matriculationNumber() {
    return matriculationNumber;
  }

  public String name() {
    return name;
  }

  @Override
  public String toString() {
    return "Student [matriculationNumber=" + matriculationNumber + ", name=" + name + "]";
  }

}
