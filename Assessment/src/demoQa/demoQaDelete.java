package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driveconect;

import java.time.Duration;

public class demoQaDelete {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demoqa.com/webtables");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id=\"searchBox\"]")).sendKeys("Kierra");
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M864 256H7')]")).click();
    }
}
