package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

public class Sdet_Day30_Frame_Iframe_01 {
    public static void main(String[] args) {
        //Practice Frame & Iframe

        WebDriver driver = DriverConnection.connect("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //Get Frame1 and insert text Manual
        //Frame 1
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Manual");

        driver.switchTo().defaultContent();

        //Frame 2

        WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Software Testing..");
        driver.switchTo().defaultContent();

        //goto iframe inside frame 3
        driver.switchTo().frame(frame3);
        driver.switchTo().frame(0);// switching to iframe from frame 3 using index 0

        //driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        //driver.switchTo().defaultContent();

        //another way to click radiobutton by javascriptExecutor
        WebElement rdbtn=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",rdbtn);
        driver.switchTo().defaultContent();

        //goto frame 4
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Text input in frame 4");
        driver.switchTo().defaultContent();
        //goto frame  5

       WebElement frame5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
       driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame 5 text");

        //driver.switchTo().defaultContent();

       //click on link of frame 5
        driver.findElement(By.linkText("https://a9t9.com")).click();
        boolean logostatu=driver.findElement(By.xpath("//img[@src='/Content/Images/ui.vision.logo2.webp']")).isDisplayed();
        System.out.println(logostatu);
    }
}
