package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driveconect;

import java.time.Duration;

public class A004RegisterUrSlfGmail {
    public static void main(String[] args) {
        WebDriver driver= Driveconect.connect("https://accounts.google.com/lifecycle/steps/signup/name?ddm=0&dsh=S2116822803:1727512672054379&flowEntry=SignUp&flowName=GlifWebSignIn&TL=APps6ebopWxVdJilptqqymv8jciP_UcwJ_RFXvU-Df6Uk4HjlPkhvfJz74nx1aH7");
        //driver.findElement(By.linkText("Create an account")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Nikunj");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Majmudar123");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();

        WebElement month = driver.findElement(By.id("month"));
        Select months= new Select(month);
        months.selectByVisibleText("November");

        driver.findElement(By.id("day")).sendKeys("27");
        driver.findElement(By.id("year")).sendKeys("1989");

        WebElement gender = driver.findElement(By.id("gender"));
        Select genders = new Select(gender);
        genders.selectByVisibleText("Male");
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
        driver.findElement(By.xpath("//div[@class='zJKIV lezCeb kAVONc i9xfbb N2RpBe']//div[@class='t5nRo Id5V1']")).click();

    }
}
