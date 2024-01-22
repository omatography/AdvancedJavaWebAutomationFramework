package org.omatography.AdvancedJavaWebAutomationFramework.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.omatography.AdvancedJavaWebAutomationFramework.constants.GlobalConstants;
import org.omatography.AdvancedJavaWebAutomationFramework.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver initDriver() throws IOException {
        Properties configProperties = PropertiesReader.returnProperties(GlobalConstants.ProjectConstants.configProperties.toString());
        String browser = configProperties.getProperty("browser");
        System.out.println("Setting up the browser: "+browser);

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } if(browser.equalsIgnoreCase("safari")){
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new ChromeDriver());
        }else{
            System.out.println("Please mention the correct browser in properties.");
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        return getDriver();
    }

    public static synchronized WebDriver getDriver(){
        return tlDriver.get();
    }

    public synchronized void quitDriver(){
        tlDriver.get().quit();
    }
}
