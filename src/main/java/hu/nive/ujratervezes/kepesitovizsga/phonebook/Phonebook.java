package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Contacts and output file can not be empty");
        }
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry entry : contacts.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue() + '\n');
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not write the file", ioe);
        }
    }
}
