package com.epam.mjc.nio;

import java.io.*;
import java.nio.file.Paths;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String name = "";
        int age = 0;
        String email = "";
        long phone = 0L;
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            name = reader.readLine();
            age = Integer.parseInt(reader.readLine());
            email = reader.readLine();
            phone = Long.parseLong(reader.readLine());
        } catch (IOException e) {

        }
        return new Profile(name, age, email, phone);
    }
}
