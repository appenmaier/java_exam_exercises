package exams2.classdiagrams.library;

import java.util.Objects;
import java.util.UUID;

/**
 * Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Book {

  private final Author author;
  private final UUID id;
  private final String title;

  public Book(Author author, String title) {
    id = UUID.randomUUID();
    this.author = author;
    this.title = title;
  }

  public Author author() {
    return author;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return Objects.equals(author, other.author) && Objects.equals(id, other.id)
        && Objects.equals(title, other.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, id, title);
  }

  public UUID id() {
    return id;
  }

  public String title() {
    return title;
  }

  @Override
  public String toString() {
    return "Book [id=" + id + ", author=" + author + ", title=" + title + "]";
  }

}
