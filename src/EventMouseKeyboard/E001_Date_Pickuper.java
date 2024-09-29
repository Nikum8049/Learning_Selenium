package EventMouseKeyboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class E001_Date_Pickuper {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

       WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
        //WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("datepicker")).click();

        String myDate= "27";
        String myMonth= "November";
        String myYear = "2024";

        //techlistic.com/p/selenium-practice-form.html
        //rahulshettyacademy.com

        String currentYear  = driver.findElement(By.className("ui-datepicker-year")).getText();
        String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();

                int a = Integer.parseInt(currentYear);
                int b = Integer.parseInt(myYear);

                while (!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear) || !driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
                {
                    if (b > a)
                    {
                        driver.findElement(By.xpath("//*[@title='Next']")).click();
                    }
                    else
                    {
                        driver.findElement(By.xpath("//*[@title='Prev']")).click();
                    }
                }


                //List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

             List<WebElement> dates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

            for(WebElement date : dates)
            {
                if(date.getText().equals(myDate))
                {
                    date.click();
                    break;
                }
            }


    }

}
