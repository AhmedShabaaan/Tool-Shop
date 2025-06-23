package org.example.stepDefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configreader {

    //set value (store data) inside config.properties  set value from class to config.properties
    public static void set(String key,String value) {
        try {

            Properties prop = new Properties();

            FileInputStream fis = new FileInputStream("config.properties");

            prop.load(fis);

            prop.setProperty(key, value);

            fis.close();

            FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos, "");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //get value (store data) inside config.properties  get value from class to config.properties

    public static String get(String key) {
        String value;

        try {

            Properties prop = new Properties();

            FileInputStream fis = new FileInputStream("config.properties");

            prop.load(fis);

             value = prop.getProperty(key);
            fis.close();
            return value;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
