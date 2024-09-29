package basicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverConnection;

import java.time.Duration;

public class Sdet_Day29_Alertbox_Without_Switchto_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //handle alertbox using Explicit wait ,without using switchto()

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait declaration
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);

        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
        myalert.accept();

    }
}
