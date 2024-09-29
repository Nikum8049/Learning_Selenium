package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class B0010Hw_Demo_QA_Name_edit {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//input[@id=\"searchBox\"]")).sendKeys("Cierra");
        driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']")).click();

        driver.navigate().back();

    }
}
