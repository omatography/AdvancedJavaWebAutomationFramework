package org.omatography.AdvancedJavaWebAutomationFramework.utils;

import org.omatography.AdvancedJavaWebAutomationFramework.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class ElementUtils {

    WebDriver driver;
    Properties locatorProperties;
    public ElementUtils() throws IOException {
        driver = DriverFactory.getDriver();
        locatorProperties =  PropertiesReader.returnProperties("locators.properties");
    }

    public void loadUrl(String url){
        driver.get(url);
    }

    public By returnLocator(String str){
        String locString = locatorProperties.getProperty(str);
        String locator = locString.substring(0,locString.indexOf("@"));
        System.out.println("Locator: "+locator);
        String mode = locString.substring(locString.indexOf("@")).replace("@@@","");
        System.out.println("By Using: "+mode);
        switch (mode){
            case "id":
                return By.id(locator);
            case "xpath":
                return By.xpath(locator);
            default:
                System.out.println("No proper mode is mentioned.");
                return null;
        }

    }
    public void click(String uri){
        System.out.println("Clicking"+uri);
        driver.findElement(returnLocator(uri)).click();
    }
}
