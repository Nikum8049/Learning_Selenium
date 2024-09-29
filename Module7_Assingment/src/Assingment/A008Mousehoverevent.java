package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Driveconect;

public class A008Mousehoverevent {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driveconect.connect("https://demo.guru99.com/test/newtours/register.php");

        WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
       // home.click();
        Actions actions = new Actions(driver);
        Thread.sleep(5000);
        actions.moveToElement(home);
        actions.perform();


    }
}
