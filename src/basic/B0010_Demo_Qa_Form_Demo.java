package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class B0010_Demo_Qa_Form_Demo {
    public static <Web> void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("firstName")).sendKeys("Nikunj");
        driver.findElement(By.id("lastName")).sendKeys("Majmudar");
        driver.findElement(By.id("userEmail")).sendKeys("nikummajmudar@gmail.com");
        driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9879580089");
        driver.findElement(By.id("subjectsInput")).sendKeys("Software Testing");
        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']")).click();
        //driver.findElement(By.linkText("Choose File")).click();

    }
}
