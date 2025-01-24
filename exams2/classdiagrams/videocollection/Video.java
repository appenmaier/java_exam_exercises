package exams2.classdiagrams.videocollection;

import java.util.Objects;

/**
 * Video
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Video {

   private final Movie movie;

   public Video(Movie movie) {
      this.movie = movie;
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
      Video other = (Video) obj;
      return Objects.equals(movie, other.movie);
   }

   @Override
   public int hashCode() {
      return Objects.hash(movie);
   }

   public Movie movie() {
      return movie;
   }

   @Override
   public String toString() {
      return "Video [movie=" + movie + "]";
   }

}
