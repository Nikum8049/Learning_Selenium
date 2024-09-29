package Switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class W001_WindowSwitch {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");

        driver.manage().window().maximize();
        String mainWin = driver.getWindowHandle();
        //System.out.println("Main : "+mainWin);

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> wins =  driver.getWindowHandles();
        for(String win : wins)
        {
            if(!win.equals(mainWin))
            {
                driver.switchTo().window(win);
            }
        }

        driver.findElement(By.name("emailid")).sendKeys("test@gmial.com");

        driver.findElement(By.name("btnLogin")).click();

//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();

        driver.quit();

    }


}
