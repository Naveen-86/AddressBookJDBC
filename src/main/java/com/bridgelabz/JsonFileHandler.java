package com.bridgelabz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonFileHandler {
    /**
     * giving a file path: same folder as project and given file name.
     */
    private static final String JSON_FILE_NAME = "Contacts.json";

    public void jsonWriter(List<String> contactsList) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Writer writer = null;
        try {
            writer = Files.newBufferedWriter(Paths.get(JSON_FILE_NAME));
            gson.toJson(contactsList,writer);
            System.out.println("Wrote to json!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
