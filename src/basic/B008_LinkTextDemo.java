package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driveconect;

import java.util.List;

public class B008_LinkTextDemo {
    public static void main(String[] args) {

        WebDriver driver = Driveconect.connect("https://www.fb.com");

        //driver.findElement(By.linkText("Forgotten password?")).click();

        List<WebElement> links = driver.findElements(By.partialLinkText("Create"));

        for(WebElement link : links)
        {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

    }
}
