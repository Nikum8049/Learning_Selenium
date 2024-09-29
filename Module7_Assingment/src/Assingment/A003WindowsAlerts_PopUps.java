package Assingment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverConnection;

public class A003WindowsAlerts_PopUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Normal alerts
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();*/


        //want to print /get alert text then
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(5000);
        Alert myalert= driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();*/

        //Confirmation Alert - Ok and cancel
        /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();*/

        //Promt alert Input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(5000);
        Alert myalert= driver.switchTo().alert();
        myalert.sendKeys("Hello, Welcome");
        Thread.sleep(5000);
        myalert.accept();

    }
}
