package exams1.classdiagrams.santaclaus;

import java.util.Objects;

/**
 * Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Book extends Present {

   private final String title;
   private final String author;

   public Book(String title, String author) {
      this.title = title;
      this.author = author;
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
      Book other = (Book) obj;
      return Objects.equals(author, other.author) && Objects.equals(title, other.title);
   }

   @Override
   public String getDescription() {
      return title + " " + author;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + Objects.hash(author, title);
      return result;
   }

   @Override
   public String toString() {
      return "Book [title=" + title + ", author=" + author + "]";
   }

}
