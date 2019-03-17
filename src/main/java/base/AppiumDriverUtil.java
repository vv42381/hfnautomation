package base;

import constants.PropertyConfigs;
import helpers.ConfigReader;
import helpers.DateHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AppiumDriverUtil {

    private static final ThreadLocal<WebDriver> drivers = ThreadLocal.withInitial(() -> null);
    private static final int implicitWait = Integer.parseInt(ConfigReader.getInstance().getValue(PropertyConfigs.APPIUM_IMPLICIT_WAIT));
    public static final String driverType = ConfigReader.getInstance().getValue(PropertyConfigs.PLATFORM_NAME);
    
    
    public static AppiumDriver getDriver() {
        switch (driverType) {
            case "Android":
                return (AndroidDriver) drivers.get();
            case "iOS":
                return (IOSDriver) drivers.get();
            default:
                return (AppiumDriver) drivers.get();
        }
    }

    public static void setDriver(WebDriver driver) {
        drivers.set(driver);         
    }

    public static void sleep(Integer miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
        }
    }

    public static MobileElement getElement(By locator) {
        return (MobileElement) getDriver().findElement(locator);
    }

    public static MobileElement getElement(MobileElement parent, By locator) {
        return parent.findElement(locator);
    }

    public static List<MobileElement> getElements(By locator) {
    	getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return getDriver().findElements(locator);
    }

    public static List<MobileElement> getElements(MobileElement parent, By locator) {
        return parent.findElements(locator);
    }

    public static List<MobileElement> getElementsOrEmpty(By locator) {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<MobileElement> temp = getDriver().findElements(locator);
        getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return temp;
    }

    public static List<MobileElement> getElementsOrEmpty(WebElement parent, By locator) {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        List<MobileElement> temp = parent.findElements(locator);
        getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        return temp;
    }

    public static String writeScreenshotToFile(byte[] screen, String nameTemplate, String path) {
        try {
            if (path == null) {
                path = "./target/screenshots/" + nameTemplate + "_" + DateHelper.getTodaysDateTime() + ".png";
            }
            FileUtils.writeByteArrayToFile(new File(path), screen);

        } catch (IOException e) {
            path = "Failed to capture screenshot: " + e.getMessage();
        }

        return path;
    }

    public static String writeScreenshotToFileAbsolut(byte[] screen, String nameTemplate, String path) {
        String filePath = writeScreenshotToFile(screen, nameTemplate, path);
        return new File(filePath).getAbsolutePath();
    }

    public static byte[] getScreenshot() {
        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }
    
    public static void setContext() throws InterruptedException {
    	String contextName = getDriver().getContext();
    	System.out.println(contextName);
    	if (contextName.contains("NATIVE_APP")) {
    	System.out.println("Show me:" + contextName);
    	Thread.sleep(1500);
    	getDriver().context("NATIVE_APP");
    	
    	}
    	if (contextName.contains("WEBVIEW")) {
    	getDriver().context("WEBVIEW");
    	}
    }
    
    public static void hideKeyboard() {
    	getDriver().hideKeyboard();
    }
    
    public static void enterTextByJavaScript(WebElement element, String text) {
		if (!text.equals("IGNORE")) {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + text + "';", element);
		}
	}
    
    public static void enterTextByJavaScript(String by, String text) {
		if (!text.equals("IGNORE")) {
			WebElement element = getDriver().findElement(By.xpath(by));
			((JavascriptExecutor) (WebDriver) getDriver()).executeScript("arguments[0].value='" + text + "';", element);
			((JavascriptExecutor) getDriver()).executeScript("document.getElementsByXpath('"+by+"').value='"+text+"'");
		}
	}
    
}
