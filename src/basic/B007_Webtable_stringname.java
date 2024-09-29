package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driveconect;

public class B007_Webtable_stringname {
    public static void main(String[] args) {
        WebDriver driver = Driveconect.connect("https://demoqa.com/webtables");
        String name = "Alden";

        WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']"));
        try
        {
            if (element.isDisplayed())
            {
                driver.findElement(By.xpath("//*[text()='" + name + "']/following-sibling::div[6]/div/span[1]")).click();
            }
        }catch (Exception e) {
            System.out.println("element not found");
        }
    }
}
