package EventMouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E001_MouseEvent_01_DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        //demo.guru.99.com
System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
        driver.switchTo().frame(frame);

        WebElement img1= driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
        WebElement img2= driver.findElement(By.xpath("//*[@id='gallery']/li[2]"));
        WebElement img3= driver.findElement(By.xpath("//*[@id='gallery']/li[3]"));
        WebElement img4= driver.findElement(By.xpath("//*[@id='gallery']/li[4]"));
        WebElement trash = driver.findElement(By.id("trash"));
        Actions builder = new Actions(driver);
       // builder.dragAndDrop(img1,trash).build().perform();



      Actions e1 = builder.clickAndHold(img1).moveToElement(trash).release();
      Actions e2 = builder.clickAndHold(img2).moveToElement(trash).release();
      Actions e3 = builder.clickAndHold(img3).moveToElement(trash).release();
      Actions e4 = builder.clickAndHold(img4).moveToElement(trash).release();

        e1.perform();
        Thread.sleep(2000);
        e2.perform();
        Thread.sleep(2000);
        e3.perform();
        Thread.sleep(2000);
        e4.perform();
        Thread.sleep(2000);

    }
}
