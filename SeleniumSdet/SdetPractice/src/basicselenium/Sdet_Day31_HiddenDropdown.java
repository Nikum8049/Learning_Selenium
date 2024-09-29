package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

import java.util.List;

public class Sdet_Day31_HiddenDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Login Steps
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Goto PIM Tab
        driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();

        //Click on Select Drowpdown
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(5000);
        //Select single option
       // driver.findElement(By.xpath("//span[normalize-space()='Chief Financial Officer']")).click();

        //count Number of options available
        List<WebElement> options= driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Number of Available Options are :" + options.size());

        //Printing Options Name
        for(WebElement op:options)
        {
            System.out.println(op.getText());
        }
    }
}
