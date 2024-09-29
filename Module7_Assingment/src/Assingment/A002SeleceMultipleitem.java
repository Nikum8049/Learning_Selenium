package Assingment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import util.DriveConnectAsingment;

import java.util.List;

public class A002SeleceMultipleitem {
    public static void main(String[] args) {
        WebDriver driver= DriveConnectAsingment.connection("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        driver.manage().window().maximize();


        WebElement course =driver.findElement(By.xpath("//select[@id='course']"));
        Select courses = new Select(course);
        //courses.selectByIndex(1);
        //courses.selectByValue("js");
        courses.selectByVisibleText("Python");

        WebElement ide=driver.findElement(By.cssSelector("select#ide"));
        Select ideoption= new Select(ide);
        List<WebElement> ideoptions= ideoption.getOptions();
        for(WebElement op:ideoptions)
        {
            if(op.getText().equals("Eclipse") || op.getText().equals("Visual Studio") || op.getText().equals("NetBeans"))
            {
                op.click();
            }

        }
    }
}
