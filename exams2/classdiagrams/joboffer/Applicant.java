package exams2.classdiagrams.joboffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Bewerber
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class Applicant extends Person {

  private final int applicantId;
  private final List<ApplicationDocument> applicationDocuments;

  public Applicant(String name, long birthDateTimeStamp, int applicantId) {
    super(name, birthDateTimeStamp);
    this.applicantId = applicantId;
    applicationDocuments = new ArrayList<>();
  }

  public void addApplicationDocument(ApplicationDocument applicationDocument) {
    applicationDocuments.add(applicationDocument);
  }

  public int applicantId() {
    return applicantId;
  }

  public List<ApplicationDocument> applicationDocuments() {
    return applicationDocuments;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Applicant other = (Applicant) obj;
    return applicantId == other.applicantId
        && Objects.equals(applicationDocuments, other.applicationDocuments);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(applicantId, applicationDocuments);
    return result;
  }

  @Override
  public String toString() {
    return "Applicant [applicantId=" + applicantId + ", applicationDocuments="
        + applicationDocuments + ", birthDateTimeStamp()=" + birthDateTimeStamp() + ", name()="
        + name() + "]";
  }

}
