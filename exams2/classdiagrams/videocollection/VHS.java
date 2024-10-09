package exams2.classdiagrams.videocollection;

import java.util.Objects;

/**
 * VHS
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class VHS extends Video {

  private final boolean isRewritable;

  public VHS(Movie movie, boolean isRewritable) {
    super(movie);
    this.isRewritable = isRewritable;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    VHS other = (VHS) obj;
    return isRewritable == other.isRewritable;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(isRewritable);
    return result;
  }

  public boolean isRewritable() {
    return isRewritable;
  }

  @Override
  public String toString() {
    return "VHS [isRewritable=" + isRewritable + ", movie()=" + movie() + "]";
  }

}
