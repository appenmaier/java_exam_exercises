package exams2.classdiagrams.videocollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Represents a collection of video media that can be populated from a file or searched by title.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record VideoCollection(List<Video> videos) {

   /**
    * Adds a video to this collection.
    */
   public void addVideo(Video video) {
      videos.add(video);
   }

   /**
    * Imports videos from a semicolon-delimited file and adds them to the collection.
    */
   public void importVideos(File file) throws FileNotFoundException {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");
         String title = tokens[0];
         Genre genre = Genre.valueOf(tokens[1]);
         short publishingYear = Short.valueOf(tokens[2]);
         Movie movie = new Movie(title, genre, publishingYear);
         Video video;
         if (tokens[3].equals("VHS")) {
            boolean isRewritable = Boolean.valueOf(tokens[4]);
            video = new Vhs(movie, isRewritable);
         } else {
            double capacity = Double.valueOf(tokens[4]);
            video = new BluRay(movie, capacity);
         }
         addVideo(video);
      }
      scanner.close();
   }

   /**
    * Returns the first video whose movie title matches the given string, if any.
    */
   public Optional<Video> getVideoByMovieTitle(String title) {
      for (Video v : videos) {
         if (v.movie().title().equals(title)) {
            return Optional.of(v);
         }
      }
      return Optional.empty();
   }

}
