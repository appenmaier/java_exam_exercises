package exams2.videocollection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * VideoCollectionTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VideoCollectionTest {

  private VideoCollection collection;
  private BluRay evilDead;
  private VHS theMatrix;

  @BeforeEach
  void setUp() {
    collection = new VideoCollection(new ArrayList<Video>());
    theMatrix = new VHS(new Movie("The Matrix", Genre.SCIFI, (short) 1999), false);
    evilDead = new BluRay(new Movie("Evil Dead", Genre.HORROR, (short) 1981), 25);
  }

  @Test
  void testGetVideoByMovieTitle() {
    collection.addVideo(theMatrix);
    collection.addVideo(evilDead);
    assertEquals(Optional.of(evilDead), collection.getVideoByMovieTitle("Evil Dead"));
    assertEquals(Optional.empty(), collection.getVideoByMovieTitle("Evil Dead 2"));
  }

  @Test
  void testImportVideos() throws FileNotFoundException {
    assertThrows(FileNotFoundException.class, () -> collection.importVideos(new File("")));

    collection.importVideos(new File("exams2/videocollection/videos.txt"));
    assertEquals(2, collection.videos().size());
  }

}
