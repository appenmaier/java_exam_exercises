package exams2.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Woerterbuch
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Dictionary(Language sourceLanguage, Language targetLanguage,
    Map<Word, Word> entries) {

  public void addEntry(Word sourceWord, Word targetWord) throws InvalidLanguageException {
    if (!sourceWord.language().equals(sourceLanguage)
        || !targetWord.language().equals(targetLanguage)) {
      throw new InvalidLanguageException();
    }

    entries.put(sourceWord, targetWord);
  }

  public void importEntries(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");
      Language sourceLanguage = Language.valueOf(tokens[0]);
      String sourceValue = tokens[1];
      Language targetLanguage = Language.valueOf(tokens[2]);
      String targetValue = tokens[3];
      Word sourceWord = new Word(sourceValue, sourceLanguage);
      Word targetWord = new Word(targetValue, targetLanguage);
      entries.put(sourceWord, targetWord);
    }
    scanner.close();
  }

  public Optional<String> getTranslation(String word) {
        for (Map.Entry<Word, Word> entry : entries.entrySet()) {
            if (entry.getKey().value().equals(word)) {
                return Optional.of(entry.getValue().value());
            } else if (entry.getValue().value().equals(word)) {
                return Optional.of(entry.getKey().value());
            }
        }
        return Optional.empty();
   }

}
