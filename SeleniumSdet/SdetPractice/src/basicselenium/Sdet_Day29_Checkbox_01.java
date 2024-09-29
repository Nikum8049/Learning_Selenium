package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sdet_Day29_Checkbox_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Select Specific Checkbox
      //  driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //Select all the checkbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        /*for(int i=0;i< checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }*/
        //Select all the checkbox by enhanced for loop
        /*for ( WebElement checkbox : checkboxes)
        {
            checkbox.click();
        }*/

        //Select Last 3 checkbox only
        /*for(int i=4;i< checkboxes.size();i++)
        {
            checkboxes.get(i).click();
        }*/

        //Select First 3 checkbox only
        /*for(int i=0;i<3;i++)
        {
            checkboxes.get(i).click();
        }*/

        //Unselect Checkbox if they are selected
        for(int i=0;i<3;i++)
        {
            checkboxes.get(i).click();
        }

        Thread.sleep(5000);

        for(int i=0;i<checkboxes.size();i++)
        {
            if(checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }
        }
    }
}
