package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driveconect;

public class B0015_Screenshotdemo {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://www.amazon.in/");

    Driveconect.screenShotstops(driver,"home");
    driver.findElement(By.linkText("Electronics")).click();
    Driveconect.screenShotstops(driver,"electronics");
    driver.switchTo().defaultContent();

    driver.findElement(By.linkText("Home & Kitchen")).click();
    Driveconect.screenShotstops(driver,"home and kitchen");
    driver.switchTo().defaultContent();

    }






}
