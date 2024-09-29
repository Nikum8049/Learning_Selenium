package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.DriverConnection;

import java.time.Duration;
import java.util.List;

public class Sdet_Day31_DropDownBySelect_01 {
    public static void main(String[] args) {
        WebDriver driver= DriverConnection.connect("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //Select Single Element from list
        WebElement drpCountryEle =driver.findElement(By.xpath("//select[@id='country']"));
        Select drpcountry = new Select(drpCountryEle);
        //drpcountry.selectByVisibleText("Australia");
        //drpcountry.selectByValue("uk");
        //drpcountry.selectByIndex(4);

        //Capture - Get all the options from the dropdownlist

        List<WebElement> options=drpcountry.getOptions();
        System.out.println("Number of the option available in dropdown is  : " + options.size());

        //printing all the option name by normal for loop

        for(int i=0;i< options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }
        //Printing all the option Name by enhanced for loop
        /*for(WebElement op:options)
        {
            System.out.println(op.getText());
        }*/
    }
}
