package exams1.christmastree;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

  public static void main(String[] args) {

    ChristmasTree christmasTree = new ChristmasTree("Nordmanntanne", 1.95);

    christmasTree.addCandle(new Candle("weiss"));
    christmasTree.addCandle(new Candle("weiss"));
    christmasTree.addCandle(new Candle("weiss"));
    christmasTree.addCandle(new ElectricCandle("blau"));
    christmasTree.addCandle(new ElectricCandle("blau"));
    christmasTree.addCandle(new ElectricCandle("gelb"));
    christmasTree.addCandle(new ElectricCandle("gelb"));
    christmasTree.addCandle(new ElectricCandle("gruen"));
    christmasTree.addCandle(new ElectricCandle("gruen"));

    christmasTree.lightChristmasTree();

    System.out.println("Alle Kerzen: " + christmasTree.candles());
    System.out.println("Anzahl elektrischer Kerzen: " + christmasTree.getNumberOfElectricCandles());

  }

}
