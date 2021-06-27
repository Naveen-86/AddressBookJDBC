package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NormalFileHandler {
    private static final String NORMAL_FILE = "Contacts.txt";

    /**
     * Writing to txt file
     *
     * @param contactList
     * @throws IOException
     */
    public void writeToNormalTextFile(List<String> contactList) {
        Writer writer = null;
        try {
            writer = Files.newBufferedWriter(Path.of(NORMAL_FILE));
            writer.write(contactList.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * reading from tex file
     * prints to the console and returns as list
     *
     * @return
     */
    public List<String> readingFromTexFile() {
        try {
            BufferedReader reader = Files.newBufferedReader(Path.of(NORMAL_FILE));
            List<String> dataList = new ArrayList<>();
            String dataLine;
            while ((dataLine = reader.readLine()) != null) {
                System.out.println(dataLine);//to print to the console
                dataList.add(dataLine);//to test
            }
            return dataList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
