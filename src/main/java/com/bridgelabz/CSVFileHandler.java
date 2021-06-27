package com.bridgelabz;

import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Read or write to the csv file
 */
public class CSVFileHandler {
    /**
     * giving a file path: same folder as project and given file name.
     */
    private static final String FILE_NAME = "Contacts.csv";

    public void csvWriter(List<String[]> contactsList) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
        Writer writer = Files.newBufferedWriter(Paths.get(FILE_NAME));
        CSVWriter csvWriter = new CSVWriter(writer);
        csvWriter.writeAll(contactsList);
        csvWriter.flush();
        writer.close();
    }
}
