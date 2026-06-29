package exams2.classdiagrams.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents a library that manages a collection of books and their availability status.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Library(String name, Map<Book, Status> books) {

   /**
    * Adds the given book to the library with an initial status of available.
    *
    * @param book the book to add
    */
   public void addBook(Book book) {
      books.put(book, Status.AVAILABLE);
   }

   /**
    * Returns the book with the given title, if it exists in the library.
    *
    * @param title the title to search for
    * @return an {@link java.util.Optional} containing the matching book, or empty if not found
    */
   public Optional<Book> getBookByTitle(String title) {
      for (Book b : books.keySet()) {
         if (b.title().equals(title)) {
            return Optional.of(b);
         }
      }
      return Optional.empty();
   }

   /**
    * Returns all paper books that currently have the given status.
    *
    * @param status the status to filter by
    * @return a list of paper books with the specified status
    */
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
