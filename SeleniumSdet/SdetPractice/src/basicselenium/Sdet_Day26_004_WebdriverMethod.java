package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnection;

public class Sdet_Day26_004_WebdriverMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverConnection.connect("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //isDisplayed :
//        WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//        System.out.println("Display Status of LOGO is  : " + logo.isDisplayed()); //true

//       boolean status = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
//        System.out.println("Displayn Status is : "+ status ); //true

        //isenable :

//        boolean status=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled();
//        System.out.println("Check status enable or disable :" + status); //true

        //isSelected
        WebElement male_rd= driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female_rd= driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Before selecting......... ");
        System.out.println("male  is selected" + male_rd.isSelected()); //false
        System.out.println("Female is Selected" + female_rd.isSelected()); //false

        System.out.println("after selecting......... ");
        /*male_rd.click();
        System.out.println("male  is selected : " + male_rd.isSelected()); //true
        System.out.println("Female is not Selected : " + female_rd.isSelected()); //false*/

        female_rd.click();
        System.out.println("male  is not  selected : " + male_rd.isSelected()); //false
        System.out.println("Female is Selected : " + female_rd.isSelected()); //true
    }


}
