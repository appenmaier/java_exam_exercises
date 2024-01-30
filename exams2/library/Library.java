package exams2.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

  public Book getBookByTitle(String title) {
    for (Book b : books.keySet()) {
      if (b.title().equals(title)) {
        return b;
      }
    }
    return null;
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
