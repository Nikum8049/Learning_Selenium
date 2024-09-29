package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sdet_002_CssSelector {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       // driver.get("https://demo.nopcommerce.com/");
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //tagname#idname

//driver.findElement(By.cssSelector("input#tnb-google-search-input")).sendKeys("HTML");
// driver.findElement(By.cssSelector("svg#tnb-google-search-icon")).click();

        driver.findElement(By.cssSelector("input#search2")).sendKeys("HTML");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("button#learntocode_searchbtn")).click();


    }
}
