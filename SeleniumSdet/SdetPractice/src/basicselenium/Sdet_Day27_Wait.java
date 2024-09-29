package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import util.DriverConnection;

import java.sql.Connection;
import java.time.Duration;

public class Sdet_Day27_Wait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //ExplicitWait Declaration and used
        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10)); // Explicit wait Declartion

       WebElement txtemail= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='EmailHomePage']")));
        txtemail.sendKeys("test@gmail.com");


        //fluentwait Declaration
        Wait<WebDriver> mywait1= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);




        /*Boolean status1=driver.findElement(By.xpath("//input[@name='EmailHomePage']")).isEnabled();
        System.out.println(status1);*/
        //Thread.sleep(5000);

        //driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("test@gmail.com");
        driver.close();
    }
}
