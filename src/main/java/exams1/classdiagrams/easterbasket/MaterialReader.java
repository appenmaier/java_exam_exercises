package exams1.classdiagrams.easterbasket;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads materials from a semicolon-delimited file.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
class MaterialReader {

   /**
    * Reads all materials from the given file. Each line must contain name and weight per unit
    * separated by a semicolon.
    *
    * @param file the file to read
    * @return list of materials
    * @throws FileNotFoundException if the file does not exist
    */
   public static List<Material> readMaterials(File file) throws FileNotFoundException {
      List<Material> materials = new ArrayList<>();
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");
         String name = tokens[0];
         double weight = Double.parseDouble(tokens[1]);
         Material material = new Material(name, weight);
         materials.add(material);
      }

      scanner.close();

      return materials;
   }

}
