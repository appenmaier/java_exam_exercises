package exams2.classdiagrams.videocollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Videosammlung
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record VideoCollection(List<Video> videos) {

  public void addVideo(Video video) {
    videos.add(video);
  }

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
        video = new VHS(movie, isRewritable);
      } else {
        double capacity = Double.valueOf(tokens[4]);
        video = new BluRay(movie, capacity);
      }
      addVideo(video);
    }
    scanner.close();
  }

  public Optional<Video> getVideoByMovieTitle(String title) {
    for (Video v : videos) {
      if (v.movie().title().equals(title)) {
        return Optional.of(v);
      }
    }
    return Optional.empty();
  }

}
