package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private static final String PROPERTIES_FILE_PATH = "src/main/resources/config/%s-config.properties";
    public static String getProperty(String key){
        try (InputStream input = new FileInputStream(String.format(PROPERTIES_FILE_PATH,
                System.getProperty("env")))) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException("Error while reading property file", e);
        }
    }
}