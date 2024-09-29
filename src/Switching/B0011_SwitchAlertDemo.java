package Switching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class B0011_SwitchAlertDemo {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        // alert with ok accept only
//        driver.findElement(By.id("alertButton")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

//        driver.findElement(By.id("timerAlertButton")).click();

//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();


        //Alert with ok and cancel
 //       driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.id("CancelTab")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();



        //alert with confirm button
//        driver.findElement(By.id("confirmButton")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

        //alert with box with input box
//        driver.findElement(By.id("promtButton")).click();
//        Alert alert = driver.switchTo().alert();
//        alert.sendKeys("NIkunj Majmudar");
//        alert.accept();




    }
}
