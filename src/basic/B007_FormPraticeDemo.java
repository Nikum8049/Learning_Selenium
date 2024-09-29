package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class B007_FormPraticeDemo {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //WebElement signup = driver.findElement(By.linkText("Create New Account"));
        //signup.click();

        driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Nikum");
        driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Majmudar");
        driver.findElement(By.name("RESULT_TextField-3")).sendKeys("9879580089");
        driver.findElement(By.name("RESULT_TextField-4")).sendKeys("India");
        driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Surat");
        driver.findElement(By.name("RESULT_TextField-6")).sendKeys("nikummajmudar@yahoo.in");
        driver.findElement(By.xpath("//*[@for='RESULT_RadioButton-7_0']")).click();

            }
}
