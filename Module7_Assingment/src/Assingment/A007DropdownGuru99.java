package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.Driveconect;

public class A007DropdownGuru99 {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demo.guru99.com/test/newtours/register.php");
        driver.findElement(By.name("firstName")).sendKeys("Nikunj");
        driver.findElement(By.name("lastName")).sendKeys("Majmudar");
        driver.findElement(By.name("phone")).sendKeys("9879580089");
        driver.findElement(By.name("userName")).sendKeys("nikunjmajmudar@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("1498,surat");
        driver.findElement(By.name("city")).sendKeys("surat");
        driver.findElement(By.name("state")).sendKeys("Gujarat");
        driver.findElement(By.name("postalCode")).sendKeys("456238");

        WebElement country = driver.findElement(By.name("country"));
        Select countries = new Select(country);
        countries.selectByVisibleText("INDIA");

    }
}
