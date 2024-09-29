package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class B008_TopsErp {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://topsint.com/topserp/index.php?lg=1");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

       WebElement login= driver.findElement(By.xpath("//select[@id='lutype']"));
        Select loginas = new Select(login);
        loginas.selectByVisibleText("Admin");
        driver.findElement(By.xpath("//input[@name='l_username']")).sendKeys("Nikunj8049");
        driver.findElement(By.xpath("//input[@name='l_password']")).sendKeys("Nikunj@8049@");
        driver.findElement(By.xpath("//input[@name='btn_login']")).click();


            }
}
