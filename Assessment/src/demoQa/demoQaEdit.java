package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.Driveconect;

import java.time.Duration;

public class demoQaEdit {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demoqa.com/webtables");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id=\"searchBox\"]")).sendKeys("Cierra");
        driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']")).click();
    }
}
