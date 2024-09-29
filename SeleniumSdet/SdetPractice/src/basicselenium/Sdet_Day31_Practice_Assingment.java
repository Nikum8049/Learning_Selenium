package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.DriverConnection;

import java.util.List;

public class Sdet_Day31_Practice_Assingment {
    public static void main(String[] args) {
        WebDriver driver= DriverConnection.connect("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();


        // Select Single Country
        WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country-list']"));
        Select drpcountry = new Select(drpcountryEle);
        //drpcountry.selectByVisibleText("France");
        //drpcountry.selectByValue("5");
        //drpcountry.selectByIndex(2);

        //Count Total Numbers Of Options

        List<WebElement> option =drpcountry.getOptions();
        System.out.println("total available options are :" + option.size());
        for(int i=1; i< option.size();i++)
        {
            System.out.println(option.get(i).getText());
        }
    }
}
