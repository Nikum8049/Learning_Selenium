package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driveconect;

public class A005Radioubutton {

    public static void main(String[] args) {

        WebDriver driver = Driveconect.connect("https://demo.guru99.com/test/radio.html");
        WebElement radio1= driver.findElement(By.id("vfb-7-1"));
        //Radiobbutton 1 is selected
        radio1.click();

        WebElement radio2= driver.findElement(By.id("vfb-7-2"));
        //Radiobbutton 1 is deselected, Radio Button 2 is selected
            radio2.click();
    }
}
