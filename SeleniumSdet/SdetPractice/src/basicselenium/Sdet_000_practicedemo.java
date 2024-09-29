package basicselenium;
import org.openqa.selenium.chrome.ChromeDriver;
import util.DriverConnection;
import org.openqa.selenium.WebDriver;

public class Sdet_000_practicedemo {
    public static void main(String[] args) {
       //1.0 Open Chrome Browser

       // WebDriver driver = DriverConnection.connect("https://demo-opencart.com/");
        WebDriver driver = new ChromeDriver();

        //2.0 Open Website
        driver.get("https://demo-opencart.com/");

        //3.0  Validate Title

        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Your Store"))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        //4.0 close browser

       // driver.close();
        driver.quit();
    }
}
