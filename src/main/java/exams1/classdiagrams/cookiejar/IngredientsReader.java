package exams1.classdiagrams.cookiejar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * IngredientsReader
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class IngredientsReader {

   public static List<Ingredient> readIngredients(File file) throws FileNotFoundException {
      Scanner sc = new Scanner(file);

      ArrayList<Ingredient> ingredients = new ArrayList<>();
      while (sc.hasNextLine()) {
         String line = sc.nextLine();
         String[] tokens = line.split(";");
         String name = tokens[2];
         double amount = Double.valueOf(tokens[0]);
         String unit = tokens[1];
         Ingredient i = new Ingredient(name, amount, unit);
         ingredients.add(i);
      }

      sc.close();

      return ingredients;
   }

}
