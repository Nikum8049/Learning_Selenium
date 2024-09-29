package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Sdet_Day26_005_Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        boolean statustextbox=driver.findElement(By.id("name")).isDisplayed();
        System.out.println(statustextbox);
        driver.findElement(By.id("name")).sendKeys("Nikunj");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nik_majmudar@gmail.com");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+914578956479");
        driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Amroli, Surat, Gujarat,Inida");
        boolean status1=driver.findElement(By.cssSelector("input[id='male']")).isEnabled();
        System.out.println(status1);
        boolean status = driver.findElement(By.cssSelector("input[id='female']")).isEnabled();
        System.out.println(status);
        driver.findElement(By.cssSelector("input[id='female']")).click();
        driver.findElement(By.cssSelector("input[id='female']")).isEnabled();
        driver.findElement(By.cssSelector("input[id='monday']")).click();
        driver.findElement(By.cssSelector("input[id='tuesday']")).click();
        driver.findElement(By.cssSelector("input[id='wednesday']")).click();
        driver.findElement(By.cssSelector("input[id='thursday']")).click();
        driver.findElement(By.cssSelector("input[id='friday']")).click();

        WebElement country=driver.findElement(By.cssSelector("select[id='country']"));
        Select countries= new Select(country);
        countries.selectByVisibleText("India");

        WebElement color=driver.findElement(By.cssSelector("select[id='colors']"));
        Select colors = new Select(color);
        colors.selectByVisibleText("Yellow");

       driver.findElement(By.cssSelector(".hasDatepicker")).sendKeys("26/March/2020");
       driver.findElement(By.xpath("//table[@name='BookTable']")).getText();

       //Select dates =new Select(date);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();

    }
}
