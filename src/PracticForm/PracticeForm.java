package PracticForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeForm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("test");
        driver.findElement(By.id("lastName")).sendKeys("tech");
        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9685748596");

        driver.findElement(By.id("dateOfBirthInput")).click();

        String myDate = "20";
        String myMonth="December";
        String myYear = "2002";


        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select months = new Select(month);
        months.selectByVisibleText(myMonth);

        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select years = new Select(year);
        years.selectByVisibleText(myYear);

        List<WebElement> dates = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));

        for(WebElement date : dates)
        {
            if(date.getText().equals(myDate))
            {
                if(date.getAttribute("aria-label").contains(myMonth))
                {
                    date.click();
                    break;
                }

            }
        }


        WebElement subject = driver.findElement(By.id("subjectsContainer"));

        Actions builder = new Actions(driver);

        builder.click(subject)
                .sendKeys("Maths")
                .sendKeys(Keys.ENTER)
                .sendKeys("Physics")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();

        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\nikum\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-08-16 231202.png");

        driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");

        WebElement state = driver.findElement(By.id("state"));
        WebElement city = driver.findElement(By.id("city"));

        builder.click(state)
                .sendKeys("Haryana")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        builder.click(city)
                .sendKeys("Panipat")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();



        Thread.sleep(5000);
        driver.quit();



    }
}
