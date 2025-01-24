package exams1.classdiagrams.shape;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * MainClass
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MainClass {

   public static void main(String[] args) throws FileNotFoundException {

      ShapeReader shapeReader = new ShapeReader(new File("exams1/classdiagrams/shape/shapes.txt"));

      System.out.println("Alle Kreise: " + shapeReader.getCircles());
      System.out.println("Alle geometrischen Figuren mit einer Flaeche von min. 4: "
            + shapeReader.getShapesWithMinArea(4));

   }

}
