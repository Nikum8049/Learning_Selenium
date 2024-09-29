package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driveconect;

public class A006FacebookImage {
    public static void main(String[] args) {
        WebDriver driver= Driveconect.connect("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

        WebElement facebooklogo= driver.findElement(By.xpath("//div[@aria-label='Facebook']//*[name()='svg']"));
        System.out.println(facebooklogo.isDisplayed());

    }
}
