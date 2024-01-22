package org.omatography.AdvancedJavaWebAutomationFramework.constants;
public class GlobalConstants {
    //class to store constant values like, properties file name, test data file name, urlName, locatorName etc.
    //properties file name
    public enum ProjectConstants{
        configProperties{
            @Override
            public String toString(){
                return "config.properties";
            }
        },
        locatorsProperties{
            @Override
            public String toString(){
                return "locators.properties";
            }
        },
        urlsProperties{
            @Override
            public String toString(){
                return "urls.properties";
            }
        }
    }
    //url names
    public enum AmazonUrls {
        homePageUrl{
            @Override
            public String toString(){
                return "homePageUrl";
            }
        }
    }
    //locator names
    public enum AmazonHomePage {
        cart{
            @Override
            public String toString(){
                return "cart";
            }
        }
    }
}
