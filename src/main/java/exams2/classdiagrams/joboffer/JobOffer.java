package exams2.classdiagrams.joboffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a job offer with a title, a responsible recruiter, and a list of applicants.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class JobOffer {

   private final List<Applicant> applicants;
   private final int id;
   private Recruiter recruiter;
   private final String title;

   public JobOffer(int id, String title, Recruiter recruiter) {
      this.id = id;
      this.title = title;
      this.recruiter = recruiter;
      applicants = new ArrayList<>();
   }

   /**
    * Adds an applicant to this job offer's list of applicants.
    */
   public void addApplicant(Applicant applicant) {
      applicants.add(applicant);
   }

   /**
    * Returns the list of applicants for this job offer.
    */
   public List<Applicant> applicants() {
      return applicants;
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
      JobOffer other = (JobOffer) obj;
      return Objects.equals(applicants, other.applicants) && id == other.id
            && Objects.equals(recruiter, other.recruiter) && Objects.equals(title, other.title);
   }

   @Override
   public int hashCode() {
      return Objects.hash(applicants, id, recruiter, title);
   }

   /**
    * Returns the unique identifier of this job offer.
    */
   public int id() {
      return id;
   }

   /**
    * Returns the recruiter responsible for this job offer.
    */
   public Recruiter recruiter() {
      return recruiter;
   }

   /**
    * Returns the title of this job offer.
    */
   public String title() {
      return title;
   }

   @Override
   public String toString() {
      return "JobOffer [id=" + id + ", title=" + title + ", recruiter=" + recruiter
            + ", applicants=" + applicants + "]";
   }

}
