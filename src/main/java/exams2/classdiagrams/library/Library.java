package exams2.classdiagrams.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Buecherei
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Library(String name, Map<Book, Status> books) {

   public void addBook(Book book) {
      books.put(book, Status.AVAILABLE);
   }

   public Optional<Book> getBookByTitle(String title) {
      for (Book b : books.keySet()) {
         if (b.title().equals(title)) {
            return Optional.of(b);
         }
      }
      return Optional.empty();
   }

   public List<PaperBook> getPaperBooksByStatus(Status status) {
      List<PaperBook> paperBooks = new ArrayList<>();
      for (Entry<Book, Status> entry : books.entrySet()) {
         if (entry.getKey() instanceof PaperBook p && entry.getValue().equals(status)) {
            paperBooks.add(p);
         }
      }
      return paperBooks;
   }

}
