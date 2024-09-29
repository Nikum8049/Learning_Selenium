package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Sdet_Day26_003_WebdriverMethod {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get (url) - open the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Window maximize
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //gettitle - return title of the page
        System.out.println(driver.getTitle()); // return Human Resources Management Software | OrangeHRM

        //getCurrentUrl() - Return url of the page
        System.out.println(driver.getCurrentUrl());

        //getPageSource() - Return SOURCE CODE OF THE page
       // System.out.println(driver.getPageSource());

        //getWindowHandle()- return id of the single browser window
//       String winid=driver.getWindowHandle();
//        System.out.println("Window id is : "+  winid); //3FF02226009ECD4675B43A8288EEDC52

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windids = driver.getWindowHandles();
        System.out.println("Windows id are : " + windids);


        //driver.close();
        driver.quit();
    }
}
