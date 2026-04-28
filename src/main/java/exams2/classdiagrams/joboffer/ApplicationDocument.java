package exams2.classdiagrams.joboffer;

import java.io.File;

/**
 * Represents a document submitted as part of a job application.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record ApplicationDocument(String description, String type, File document) {

}
