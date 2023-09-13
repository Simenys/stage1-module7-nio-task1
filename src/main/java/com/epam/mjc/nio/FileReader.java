package com.epam.mjc.nio;

import java.io.*;



public class FileReader {


    public Profile getDataFromFile(File file) {
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

        }


        String nameTrim = name.substring(name.indexOf(":") + 2);
        nameTrim.trim();

        String ageTrim = age.substring(age.indexOf(":") + 2);
        ageTrim.trim();

        String emailTrim = email.substring(email.indexOf(":") + 2);
        emailTrim.trim();

        String phoneTrim = phone.substring(phone.indexOf(":") + 2);
        phoneTrim.trim();

        return new Profile(nameTrim, Integer.parseInt(ageTrim), emailTrim, Long.parseLong(phoneTrim));
    }
}
