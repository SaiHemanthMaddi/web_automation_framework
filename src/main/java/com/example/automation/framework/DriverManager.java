package com.example.automation.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static final Logger log = LoggerFactory.getLogger(DriverManager.class);

    public static void initDriver() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        initDriver(browser);
    }

    public static void initDriver(String browser) {
        log.info("Initializing WebDriver for browser: {}", browser);

        switch (browser) {
            case "firefox":
                setupFirefox();
                break;
            case "edge":
                setupEdge();
                break;
            case "chrome":
            default:
                setupChrome();
                break;
        }

        log.info("Browser launched successfully.");
    }

    private static void setupChrome() {
        WebDriverManager.chromedriver().setup();
        log.info("ChromeDriver setup completed.");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // Enable headless mode for CI/CD environments
        if (isHeadlessMode()) {
            options.addArguments("--headless=new");
            log.info("Running Chrome in headless mode");
        }

        log.info("Launching Chrome browser...");
        driver.set(new ChromeDriver(options));
    }

    private static void setupFirefox() {
        WebDriverManager.firefoxdriver().setup();
        log.info("FirefoxDriver setup completed.");

        FirefoxOptions options = new FirefoxOptions();

        // Enable headless mode for CI/CD environments
        if (isHeadlessMode()) {
            options.addArguments("--headless");
            log.info("Running Firefox in headless mode");
        }

        log.info("Launching Firefox browser...");
        driver.set(new FirefoxDriver(options));
    }

    private static void setupEdge() {
        WebDriverManager.edgedriver().setup();
        log.info("EdgeDriver setup completed.");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // Enable headless mode for CI/CD environments
        if (isHeadlessMode()) {
            options.addArguments("--headless");
            log.info("Running Edge in headless mode");
        }

        log.info("Launching Edge browser...");
        driver.set(new EdgeDriver(options));
    }

    private static boolean isHeadlessMode() {
        return "true".equalsIgnoreCase(System.getProperty("headless", "false"));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        log.info("Closing browser...");
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
        log.info("Browser closed successfully.");
    }
}
