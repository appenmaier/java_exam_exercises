package exams2.queries.singles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Singles
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Singles {

   public static List<Single> getSingles() {
      List<Single> singles = new ArrayList<>();

      singles.add(new Single("White Christmas",
            new Artist("Bing Crosby", Country.USA, LocalDate.of(1903, 5, 3), false),
            50,
            "1942"));
      singles.add(new Single("Shape of You",
            new Artist("Ed Sheeran", Country.GBR, LocalDate.of(1991, 2, 17), true),
            42,
            "2017"));
      singles.add(new Single("Despacito",
            new Artist("Luis Fonsi", Country.PRI, LocalDate.of(1978, 4, 15), true),
            36,
            "2017"));
      singles.add(new Single("Candle in the Wind",
            new Artist("Elton John", Country.GBR, LocalDate.of(1947, 3, 25), true),
            33,
            "1997"));
      singles.add(new Single("Spotlight",
            new Artist("Xiao Zhan", Country.CHN, LocalDate.of(1991, 10, 5), true),
            33,
            "2020"));
      singles.add(new Single("Work",
            new Artist("Rihanna", Country.BRB, LocalDate.of(1988, 2, 20), true),
            33,
            "2016"));
      singles.add(new Single("Petit Papa Noel",
            new Artist("Tino Rossi", Country.FRA, LocalDate.of(1907, 4, 29), false),
            30,
            "1946"));
      singles.add(new Single("Rock Around the Clock",
            new Artist("Bill Haley", Country.USA, LocalDate.of(1925, 7, 6), false),
            25,
            "1954"));
      singles.add(new Single("Nel blu dipinto di blu (Volare)",
            new Artist("Domenico Modugno", Country.ITA, LocalDate.of(1928, 1, 9), false),
            22,
            "1958"));
      singles.add(new Single("Perfect",
            new Artist("Ed Sheeran", Country.GBR, LocalDate.of(1991, 2, 17), true),
            21,
            "2017"));

      return singles;
   }

}
