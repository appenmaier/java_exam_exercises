package exams2.classdiagrams.joboffer;

import java.io.File;

/**
 * Bewerbungsunterlagen
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ApplicationDocument(String description, String type, File document) {

}
