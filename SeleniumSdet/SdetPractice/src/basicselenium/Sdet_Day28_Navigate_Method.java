package basicselenium;

import org.openqa.selenium.WebDriver;
import util.DriverConnection;

import java.time.Duration;

public class Sdet_Day28_Navigate_Method {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= DriverConnection.connect("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        Thread.sleep(10);
        driver.navigate().to("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");

        Thread.sleep(10);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(10);
        driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");

        Thread.sleep(10);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());


    }
}
