package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B002_BrowserDemoFirefox {
    public static void main(String[] args) {
        System.setProperty("Webdriver.firefox.Driver","E:\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }
}
