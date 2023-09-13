package com.epam.mjc.nio;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReader {


    public Profile getDataFromFile(File file) {
        Logger logger = Logger.getLogger(FileReader.class.getName());
        String name = "";
        String age = "";
        String email = "";
        String phone = "";
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            name = reader.readLine();
            age = reader.readLine();
            email = reader.readLine();
            phone = reader.readLine();
        } catch (IOException e) {
            logger.log(Level.WARNING, "Exception error");
        }


        String nameTrim = name.substring(name.indexOf(":") + 2);

        String ageTrim = age.substring(age.indexOf(":") + 2);

        String emailTrim = email.substring(email.indexOf(":") + 2);

        String phoneTrim = phone.substring(phone.indexOf(":") + 2);

        return new Profile(nameTrim.trim(), Integer.parseInt(ageTrim.trim()), emailTrim.trim(), Long.parseLong(phoneTrim.trim()));
    }
}
