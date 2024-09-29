package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriveConnectAsingment;

public class A001LocatingLinks {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriveConnectAsingment.connection("https://www.guru99.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("➤ Software Testing")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("App")).click();

    }
}
