package exams2.classdiagrams.library;

import java.util.Objects;

/**
 * Represents an electronic book with a file format and file size.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class EBook extends Book {

   private final FileFormat fileFormat;
   private final int fileSize;

   /**
    * Creates an e-book with the given author, title, file format, and file size.
    *
    * @param author     the author of the e-book
    * @param title      the title of the e-book
    * @param fileFormat the file format of the e-book
    * @param fileSize   the file size in kilobytes (must be positive)
    * @throws WrongFileSizeExcpetion if the file size is not positive
    */
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
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      EBook other = (EBook) obj;
      return fileFormat == other.fileFormat && fileSize == other.fileSize;
   }

   /**
    * Returns the file format of this e-book.
    */
   public FileFormat fileFormat() {
      return fileFormat;
   }

   /**
    * Returns the file size of this e-book in kilobytes.
    */
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
