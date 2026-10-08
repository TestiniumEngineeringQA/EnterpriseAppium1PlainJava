package com.saha.appium.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Plain Java Appium tests executed by the Testinium JUnit platform.
 * Each scenario is a JUnit 5 test method.
 */
public class AppiumTest {

    public static final String hubURL = "http://172.25.1.159:4444/wd/hub";
    //public static final String hubURL = "http://172.25.6.122:4444/wd/hub";
    private AppiumDriver<MobileElement> driver;

    @BeforeEach
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String key = System.getProperty("key");
        if (key == null || key.trim().isEmpty()) {
            // Testinium may expose the same execution key through the process
            // environment when the plain JUnit launcher is used.
            key = System.getenv("key");
        }
        if (key == null || key.trim().isEmpty()) {
            key = System.getenv("TESTINIUM_KEY");
        }
        if (key == null || key.trim().isEmpty()) {
            key = System.getenv("TESTINIUM_ACCESS_KEY");
        }
        if (key == null || key.trim().isEmpty()) {
            key = System.getProperty("testinium:key");
        }

        if (key == null || key.trim().isEmpty()) {
            throw new IllegalStateException(
                    "Testinium key is missing. Expected System.getProperty(\"key\") or environment variable \"key\" / \"TESTINIUM_KEY\".");
        }

        System.setProperty("key", key);
        capabilities.setCapability("key", key);

        String platform = System.getProperty("platform", "IOS");
        String configuredHubUrl = System.getProperty("hubURL", hubURL);

        if ("ANDROID".equalsIgnoreCase(platform)) {
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                    "com.gratis.android");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                    "com.app.gratis.ui.splash.SplashActivity");
            capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID);
            driver = new AndroidDriver<MobileElement>(new URL(configuredHubUrl), capabilities);
        } else {
            capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.IOS);
            capabilities.setCapability("autoAcceptAlerts", true);
            capabilities.setCapability("bundleId", "com.pharos.Gratis");
            driver = new IOSDriver<MobileElement>(new URL(configuredHubUrl), capabilities);
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public void clickElementById(String elementId) {
        WebElement element = driver.findElement(By.id(elementId));
        element.click();
    }

    public void clickElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    /**
     * Scenario: BasicTiklamalarIOS01
     * Test id: @BasicTiklamalarIOS01
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS01() throws Exception {
        waitSeconds(15);
        clickElementByXpath("//*[contains(@text, '')]");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarIOS02
     * Test id: @BasicTiklamalarIOS02
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS02() throws Exception {
        waitSeconds(5);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
    }

    /**
     * Scenario: BasicTiklamalarIOS03
     * Test id: @BasicTiklamalarIOS03
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS03() throws Exception {
        waitSeconds(5);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarIOS04
     * Test id: @BasicTiklamalarIOS04
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS04() throws Exception {
        waitSeconds(5);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarIOS05
     * Test id: @BasicTiklamalarIOS05
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS05() throws Exception {
        waitSeconds(5);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
    }

    /**
     * Scenario: BasicTiklamalarIOS01Wait
     * Test id: @BasicTiklamalarIOS01Wait
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOS01Wait() throws Exception {
        waitSeconds(420);
        clickElementByXpath("//*[contains(@text, '')]");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroid01
     * Test id: @BasicTiklamalarAndroid01
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid01() throws Exception {
        waitSeconds(15);
        clickElementByXpath("//*[contains(@resource-id, 'android:id/button2') and contains(@text, 'İPTAL')]");
        waitSeconds(5);
    }

    /**
     * Scenario: BasicTiklamalarAndroid01Wait
     * Test id: @BasicTiklamalarAndroid01Wait
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid01Wait() throws Exception {
        waitSeconds(420);
        clickElementByXpath("//*[contains(@resource-id, 'android:id/button2') and contains(@text, 'İPTAL')]");
        waitSeconds(5);
    }

    /**
     * Scenario: BasicTiklamalarAndroid02
     * Test id: @BasicTiklamalarAndroid02
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid02() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroid03
     * Test id: @BasicTiklamalarAndroid03
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid03() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroid04
     * Test id: @BasicTiklamalarAndroid04
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid04() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroid05
     * Test id: @BasicTiklamalarAndroid05
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid05() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroid06
     * Test id: @BasicTiklamalarAndroid06
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroid06() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarAndroidFail
     * Test id: @BasicTiklamalarAndroidFail
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarAndroidFail() throws Exception {
        waitSeconds(5);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaignsadsadsad");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_campaign");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_trademarks");
        waitSeconds(2);
        clickElementById("com.gratis.android:id/nav_graph_categories");
        waitSeconds(2);
    }

    /**
     * Scenario: BasicTiklamalarIOS02
     * Test id: @BasicTiklamalarIOSFail
     */
    @org.junit.jupiter.api.Test
    public void BasicTiklamalarIOSFail() throws Exception {
        waitSeconds(5);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalarsadsadsad']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
        waitSeconds(2);
        clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
        waitSeconds(2);
    }
}

