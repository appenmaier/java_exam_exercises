package exams1.cookiejar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Plaetzchendose
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CookieJar {

  private final List<Cookie> cookies;

  public CookieJar() {
    cookies = new ArrayList<>();
  }

  public void addCookie(Cookie cookie) {
    cookies.add(cookie);
  }

  public List<Cookie> cookies() {
    return cookies;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CookieJar other = (CookieJar) obj;
    return Objects.equals(cookies, other.cookies);
  }

  public Cookie getCookieByName(String name) {
    for (int i = 0; i < cookies.size(); i++) {
      Cookie cookie = cookies.get(i);
      if (cookie.name().equals(name)) {
        cookies.remove(cookie);
        return cookie;
      }
    }
    return null;
  }

  public StuffedCookie getStuffedCookie() {
    for (int i = 0; i < cookies.size(); i++) {
      Cookie cookie = cookies.get(i);
      if (cookie instanceof StuffedCookie s) {
        cookies.remove(s);
        return s;
      }
    }
    return null;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookies);
  }

  @Override
  public String toString() {
    return "CookieJar [cookies=" + cookies + "]";
  }

}
