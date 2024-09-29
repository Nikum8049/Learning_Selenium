package DatePickerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class B0014_DatePicker_demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        driver.manage().window().maximize();


        WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
        driver.switchTo().frame(frame);

        driver.findElement(By.id("datepicker")).click();

        String myDate = "20";
        String myMonth="March";
        String myYear = "2024";

        String currentYear  = driver.findElement(By.className("ui-datepicker-year")).getText();
        String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();


        int a = Integer.parseInt(currentYear);
        int b = Integer.parseInt(myYear);

        while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear)  || !driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
        {
            if(b>a)
            {
                driver.findElement(By.xpath("//*[@title='Next']")).click();
            }
            else if(a>b)
            {
                driver.findElement(By.xpath("//*[@title='Prev']")).click();
            }
            else
            {
                while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals("January"))
                {
                    driver.findElement(By.xpath("//*[@title='Prev']")).click();
                }

                while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
                {
                    driver.findElement(By.xpath("//*[@title='Next']")).click();
                }

            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
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
