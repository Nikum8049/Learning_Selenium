package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B005_LoginTestInstagram {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        WebElement uname = driver.findElement(By.name("username"));
        WebElement pass = driver.findElement(By.name("password"));
        //WebElement login = driver.findElement(By.name("login"));

        uname.sendKeys("test@gmail.com");
        pass.sendKeys("Test123");
       // login.click();
    }
}
