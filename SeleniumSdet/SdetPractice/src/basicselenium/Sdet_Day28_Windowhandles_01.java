package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverConnection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Sdet_Day28_Windowhandles_01 {
    public static void main(String[] args) {
        WebDriver driver = DriverConnection.connect("https://hrm.medgre.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

       Set<String> windowIds= driver.getWindowHandles();
        for(String winIds : windowIds)
        {
            String title= driver.switchTo().window(winIds).getTitle(); // from title we get url
            //String url= driver.switchTo().window(winIds).getCurrentUrl(); // but from the url we cant get title ,
            System.out.println(title);
           // System.out.println(url);

           // if (url.equals(""))
            if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other website "))
            {
                driver.close();
                break;
                //windows close
             }
//            if(title.equals("OrangeHRM"))
//            {
//                driver.close();
//                break;
//                //windows close
//            }
        }
    }
}
