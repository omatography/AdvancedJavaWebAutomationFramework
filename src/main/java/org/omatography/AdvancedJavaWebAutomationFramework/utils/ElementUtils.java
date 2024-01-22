package org.omatography.AdvancedJavaWebAutomationFramework.utils;

import org.omatography.AdvancedJavaWebAutomationFramework.constants.GlobalConstants;
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
        locatorProperties =  PropertiesReader.returnProperties(GlobalConstants.ProjectConstants.locatorsProperties.toString());
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

    public void clickDynamicLocator(String uri){
        System.out.println("Clicking"+uri);
        driver.findElement(returnLocator(uri)).click();
    }

    //isExist, isExistDynamicLocator, getElementReference, getElementReferenceDynamic
    //getMultipleElememtRef, ggetMultipleElementRefDynamic, getText, verifyValue,
    //waitForElementToExist

    //hoverObject, MoveToElement, keyPress, getColorPorperty, Keys: hitEnter HitBackSpece, etc : Use Robot Class
    //Explore robotMethods  check
    //scrollup scroldown scrollTo, xoom
    //mouse functionalities: cursor, scroll, clicks
    //alertAccept, alertDismiss, getAertText
    //fileUpload,
    //sendKeys, sendKeysDynamic, sendKeysClearMeth2, sendKeysNoClest, sendKeysandEnter
    //dragAndDrop functons
    //frame functions
    //getToolTipText
    //Tabs, closeAllTabsExceptFirst, switch tab, etc
    //dropdown Functionalities getDropDownList, isSelected, getDropDownValues
    // isSelected isEnabled4
    //highlight anf unhigh elemnt

}
