package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.tethering.model.Accepted;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import util.Driveconect;

public class A008_1_KeyboardEvent {
    public static void main(String[] args) {
        WebDriver driver= Driveconect.connect("https://www.facebook.com/");

        WebElement search = driver.findElement(By.name("email"));
        Actions enter = new Actions(driver);

        enter.click(search)
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .keyDown(Keys.ARROW_UP)
                .pause(2000)
                .contextClick()
                .build()
                .perform();


    }
}
