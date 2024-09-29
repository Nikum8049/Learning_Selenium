package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B004_TitleCheck {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle = "FaceBook | Loging";

        if(expectedTitle.equals(actualTitle))
        {
            System.out.println("TestCase Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        Thread.sleep(3000);
        //driver.close();
    }
}
