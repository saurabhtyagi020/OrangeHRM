package org.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    static String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
    static Properties prop;
    public static String readKey(String key)
    {

        try {
            FileInputStream file = new FileInputStream(path);
            prop= new Properties();
            prop.load(file);
        } catch (IOException e)
        {
            System.out.println("File not found: "+e.getMessage());
        }
        return prop.getProperty(key);

    }
}
