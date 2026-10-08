package com.saha.appium.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/** Plain Java Appium test class. */
public class AppiumTest {

    public static final String hubURL = "http://172.25.1.159:4444/wd/hub";
    //public static final String hubURL = "http://172.25.6.122:4444/wd/hub";
    protected static AppiumDriver<MobileElement> driver;

    public static void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (!StringUtils.isEmpty(System.getProperty("key"))) {
            capabilities.setCapability("key", System.getProperty("key"));
            if (System.getProperty("platform").equals("ANDROID")) {
                capabilities
                        .setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                                "com.gratis.android");

                capabilities
                        .setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                                "com.app.gratis.ui.splash.SplashActivity");
                capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID);
                driver = new AndroidDriver<MobileElement>(new URL(hubURL), capabilities);
            } else {
                capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.IOS);
                capabilities.setCapability("autoAcceptAlerts", true);
                capabilities.setCapability("bundleId", "com.pharos.Gratis");
                driver = new IOSDriver<MobileElement>(new URL(hubURL), capabilities);
            }
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void waitSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public static void clickElementById(String elementId) {
        WebElement element = driver.findElement(By.id(elementId));
        element.click();
    }

    public static void clickElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

    // Each scenario creates and closes its own Appium session, matching the original behavior.

    /**
     * Scenario: BasicTiklamalarIOS01
     * Test id: @BasicTiklamalarIOS01
     */
    public static void BasicTiklamalarIOS01() throws Exception {
        setUp();
        try {
            waitSeconds(15);
            clickElementByXpath("//*[contains(@text, '')]");
            waitSeconds(2);
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS02
     * Test id: @BasicTiklamalarIOS02
     */
    public static void BasicTiklamalarIOS02() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS03
     * Test id: @BasicTiklamalarIOS03
     */
    public static void BasicTiklamalarIOS03() throws Exception {
        setUp();
        try {
            waitSeconds(5);
            clickElementByXpath("//XCUIElementTypeButton[@name='Markalar']");
            waitSeconds(2);
            clickElementByXpath("//XCUIElementTypeButton[@name='Kategoriler']");
            waitSeconds(2);
            clickElementByXpath("//XCUIElementTypeButton[@name='Kampanyalar']");
            waitSeconds(2);
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS04
     * Test id: @BasicTiklamalarIOS04
     */
    public static void BasicTiklamalarIOS04() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS05
     * Test id: @BasicTiklamalarIOS05
     */
    public static void BasicTiklamalarIOS05() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS01Wait
     * Test id: @BasicTiklamalarIOS01Wait
     */
    public static void BasicTiklamalarIOS01Wait() throws Exception {
        setUp();
        try {
            waitSeconds(420);
            clickElementByXpath("//*[contains(@text, '')]");
            waitSeconds(2);
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid01
     * Test id: @BasicTiklamalarAndroid01
     */
    public static void BasicTiklamalarAndroid01() throws Exception {
        setUp();
        try {
            waitSeconds(15);
            clickElementByXpath("//*[contains(@resource-id, 'android:id/button2') and contains(@text, 'İPTAL')]");
            waitSeconds(5);
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid01Wait
     * Test id: @BasicTiklamalarAndroid01Wait
     */
    public static void BasicTiklamalarAndroid01Wait() throws Exception {
        setUp();
        try {
            waitSeconds(420);
            clickElementByXpath("//*[contains(@resource-id, 'android:id/button2') and contains(@text, 'İPTAL')]");
            waitSeconds(5);
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid02
     * Test id: @BasicTiklamalarAndroid02
     */
    public static void BasicTiklamalarAndroid02() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid03
     * Test id: @BasicTiklamalarAndroid03
     */
    public static void BasicTiklamalarAndroid03() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid04
     * Test id: @BasicTiklamalarAndroid04
     */
    public static void BasicTiklamalarAndroid04() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid05
     * Test id: @BasicTiklamalarAndroid05
     */
    public static void BasicTiklamalarAndroid05() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroid06
     * Test id: @BasicTiklamalarAndroid06
     */
    public static void BasicTiklamalarAndroid06() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarAndroidFail
     * Test id: @BasicTiklamalarAndroidFail
     */
    public static void BasicTiklamalarAndroidFail() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    /**
     * Scenario: BasicTiklamalarIOS02
     * Test id: @BasicTiklamalarIOSFail
     */
    public static void BasicTiklamalarIOSFail() throws Exception {
        setUp();
        try {
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
        } finally {
            tearDown();
        }
    }

    public static void main(String[] args) throws Exception {
        String selectedScenario = args.length > 0 ? args[0] : System.getProperty("scenario");

        if (!StringUtils.isEmpty(selectedScenario)) {
            runScenario(selectedScenario);
            return;
        }

        List<String> failures = new ArrayList<String>();
        runScenarioAndCollect("BasicTiklamalarIOS01", failures);
        runScenarioAndCollect("BasicTiklamalarIOS02", failures);
        runScenarioAndCollect("BasicTiklamalarIOS03", failures);
        runScenarioAndCollect("BasicTiklamalarIOS04", failures);
        runScenarioAndCollect("BasicTiklamalarIOS05", failures);
        runScenarioAndCollect("BasicTiklamalarIOS01Wait", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid01", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid01Wait", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid02", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid03", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid04", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid05", failures);
        runScenarioAndCollect("BasicTiklamalarAndroid06", failures);
        runScenarioAndCollect("BasicTiklamalarAndroidFail", failures);
        runScenarioAndCollect("BasicTiklamalarIOSFail", failures);

        if (!failures.isEmpty()) {
            throw new RuntimeException("Failed scenarios: " + failures);
        }
    }

    public static void runScenario(String scenarioName) throws Exception {
        if (scenarioName == null) {
            throw new IllegalArgumentException("Scenario name cannot be null.");
        }

        switch (scenarioName) {
            case "BasicTiklamalarIOS01":
                BasicTiklamalarIOS01();
                break;
            case "BasicTiklamalarIOS02":
                BasicTiklamalarIOS02();
                break;
            case "BasicTiklamalarIOS03":
                BasicTiklamalarIOS03();
                break;
            case "BasicTiklamalarIOS04":
                BasicTiklamalarIOS04();
                break;
            case "BasicTiklamalarIOS05":
                BasicTiklamalarIOS05();
                break;
            case "BasicTiklamalarIOS01Wait":
                BasicTiklamalarIOS01Wait();
                break;
            case "BasicTiklamalarAndroid01":
                BasicTiklamalarAndroid01();
                break;
            case "BasicTiklamalarAndroid01Wait":
                BasicTiklamalarAndroid01Wait();
                break;
            case "BasicTiklamalarAndroid02":
                BasicTiklamalarAndroid02();
                break;
            case "BasicTiklamalarAndroid03":
                BasicTiklamalarAndroid03();
                break;
            case "BasicTiklamalarAndroid04":
                BasicTiklamalarAndroid04();
                break;
            case "BasicTiklamalarAndroid05":
                BasicTiklamalarAndroid05();
                break;
            case "BasicTiklamalarAndroid06":
                BasicTiklamalarAndroid06();
                break;
            case "BasicTiklamalarAndroidFail":
                BasicTiklamalarAndroidFail();
                break;
            case "BasicTiklamalarIOSFail":
                BasicTiklamalarIOSFail();
                break;
            default:
                throw new IllegalArgumentException("Unknown scenario: " + scenarioName);
        }
    }

    private static void runScenarioAndCollect(String scenarioName, List<String> failures) {
        try {
            System.out.println("========== " + scenarioName + " ==========");
            runScenario(scenarioName);
        } catch (Exception e) {
            failures.add(scenarioName);
            e.printStackTrace();
        }
    }
}
