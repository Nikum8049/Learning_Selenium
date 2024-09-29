package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class B006_FbReg {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //WebElement signup = driver.findElement(By.linkText("Create New Account"));
        //signup.click();
        driver.findElement(By.linkText("Create new account")).click();

//        try {
//            sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(By.name("firstname")).sendKeys("Nikum");
        driver.findElement(By.name("lastname")).sendKeys("Majmudar");
        driver.findElement(By.name("reg_email__")).sendKeys("nikum@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("test123456@");

        WebElement day = driver.findElement(By.id("day"));
        Select days = new Select(day);
        days.selectByVisibleText("18");
       // days.selectByValue("18");
        // days.selectByIndex(16);

        WebElement month = driver.findElement(By.id("month"));
        Select months = new Select(month);
        months.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("year"));
        Select years = new Select(year);
        years.selectByVisibleText("2023");

        List<WebElement> gender = driver.findElements(By.name("sex"));
        System.out.println(gender.size());
        gender.get(1).click();
        driver.findElement(By.name("websubmit")).click();

    }
}
