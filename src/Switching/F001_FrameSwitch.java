package Switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F001_FrameSwitch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");


       // List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        //System.out.println(frames.size());

        //driver.switchTo().frame(1);
        //driver.switchTo().frame("name");

        WebElement frame = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("test");
    }
}
