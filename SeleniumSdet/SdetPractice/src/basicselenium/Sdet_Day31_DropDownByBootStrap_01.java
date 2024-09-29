package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

import java.time.Duration;
import java.util.List;

public class Sdet_Day31_DropDownByBootStrap_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='multiselect-native-select']")).click();

        //Select Single Option
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@value='Java']")).click();

        //Capture all the Option and find out total number of Options/size

        List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//label"));
        System.out.println("Number of option Available in Dropdown list are : " + options.size());

        //Printing Options from dropdown
       /* for(WebElement op:options)
        {
            System.out.println(op.getText());
        }*/

        //Select Multiple Option
        for(WebElement op:options)
        {
            String option = op.getText();
            if(option.equals("Java") || option.equals("Python") || option.equals("MySQL") || option.equals("MS SQL Server"))
            {
                op.click();
            }
        }

        //

    }
}
