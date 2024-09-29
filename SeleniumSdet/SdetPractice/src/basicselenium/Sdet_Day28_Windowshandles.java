package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Sdet_Day28_Windowshandles {
    public static void main(String[] args) {
        WebDriver driver = DriverConnection.connect("https://hrm.medgre.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

       Set<String> windowIds= driver.getWindowHandles();
        List<String> windowList =new ArrayList<>(windowIds);
        String parentId= windowList.get(0);
        String childId= windowList.get(1);

        //Switch to child window
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        //Switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

        //way2

        for(String winIds : windowIds)
        {
            String title= driver.switchTo().window(winIds).getTitle();
            if(title.equals("OrangeHRM"))
            {
                System.out.println(driver.getCurrentUrl());
                //some validation on the parent windows
            }
        }
    }
}
