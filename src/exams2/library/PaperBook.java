package exams2.library;

import java.util.Objects;

/**
 * Gedrucktes Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class PaperBook extends Book {

  private int pages;

  public PaperBook(Author author, String title, int pages) {
    super(author, title);
    this.pages = pages;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    PaperBook other = (PaperBook) obj;
    return pages == other.pages;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(pages);
    return result;
  }

  public int pages() {
    return pages;
  }

  @Override
  public String toString() {
    return "PaperBook [pages=" + pages + ", author()=" + author() + ", id()=" + id() + ", title()="
        + title() + "]";
  }

}
