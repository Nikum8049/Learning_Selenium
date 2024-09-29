package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driveconect;

import java.util.List;

public class A010FindTotalHyperLinkGuru99 {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());
        for(WebElement link : links)
        {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

            }
}
