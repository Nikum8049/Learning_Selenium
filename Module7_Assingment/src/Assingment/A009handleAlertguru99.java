package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driveconect;

public class A009handleAlertguru99 {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("2");
        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
    }
}
