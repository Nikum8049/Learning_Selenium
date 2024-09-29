package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Driveconect;

import java.util.List;

public class FormFillUsing_Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driveconect.connect("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("Nikunj");
        driver.findElement(By.id("lastName")).sendKeys("Majmudar");
        driver.findElement(By.id("userEmail")).sendKeys("nikummajmudar@yahoo.in");
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9879580089");
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
        driver.findElement(By.className("react-datepicker__month-select")).click();
        driver.findElement(By.xpath("//option[@value='10']")).click();
        driver.findElement(By.xpath("//option[@value='1989']")).click();
        driver.findElement(By.xpath("//div[@aria-label='Choose Monday, November 27th, 1989']")).click();
        WebElement subject = driver.findElement(By.id("subjectsContainer"));
        Thread.sleep(5000);

        Actions builder = new Actions(driver);
        builder.click(subject)
                .sendKeys("Commerce")
                .sendKeys(Keys.ENTER)
                .sendKeys("Accounting")
                .sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();
        driver.findElement(By.xpath("//*[@for='hobbies-checkbox-3']")).click();

        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\nikum\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-08-16 231202.png");

        driver.findElement(By.id("currentAddress")).sendKeys("Katargam,Surat,Gujarat,India");

        WebElement state = driver.findElement(By.id("state"));
        WebElement city = driver.findElement(By.id("city"));

        builder.click(state)
                .sendKeys("NCR")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        builder.click(city)
                .sendKeys("Noida")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);

        Driveconect.screenShotstops(driver,"DemoQaFormFill");

    }
}
