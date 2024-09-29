package basicselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

import java.util.List;

public class Sdet_001_practice {
    public static void main(String[] args) {
        WebDriver driver = DriverConnection.connect("https://www.demoblaze.com/");
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Total Number or links in page are : " + links.size());
//
//        List<WebElement> images= driver.findElements(By.tagName("img"));
//        System.out.println("Total Number of Images in page are : " + images.size());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.linkText("HTC One M9")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.linkText("Add to cart")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
    }
}
