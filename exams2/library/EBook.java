package exams2.library;

import java.util.Objects;

/**
 * Elektronisches Buch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class EBook extends Book {

  private final FileFormat fileFormat;
  private final int fileSize;

  public EBook(Author author, String title, FileFormat fileFormat, int fileSize)
      throws WrongFileSizeExcpetion {
    super(author, title);
    if (fileSize <= 0) {
      throw new WrongFileSizeExcpetion();
    }
    this.fileFormat = fileFormat;
    this.fileSize = fileSize;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    EBook other = (EBook) obj;
    return fileFormat == other.fileFormat && fileSize == other.fileSize;
  }

  public FileFormat fileFormat() {
    return fileFormat;
  }

  public int fileSize() {
    return fileSize;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(fileFormat, fileSize);
    return result;
  }

  @Override
  public String toString() {
    return "EBook [fileFormat=" + fileFormat + ", fileSize=" + fileSize + ", author()=" + author()
        + ", id()=" + id() + ", title()=" + title() + "]";
  }

}
