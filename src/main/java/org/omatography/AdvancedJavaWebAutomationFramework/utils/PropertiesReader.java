package org.omatography.AdvancedJavaWebAutomationFramework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static Properties returnProperties(String propertiesName) throws IOException {

        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/config.properties");
        Properties prop = new Properties();
        prop.load(fp);
        return prop;
    }
}
