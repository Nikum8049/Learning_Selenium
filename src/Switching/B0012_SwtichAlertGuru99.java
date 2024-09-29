package Switching;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class B0012_SwtichAlertGuru99 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.name("cusid")).sendKeys("1");
        driver.findElement(By.name("submit")).click();
        Alert alert =driver.switchTo().alert();
        alert .accept();
        alert.accept();





    }
}
