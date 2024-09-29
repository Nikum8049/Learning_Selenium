package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sdet_Day24_003_Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Xpath With single attribute
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oppo");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        //xpath with multiple attribute

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] [@placeholder='Search Amazon.in']")).sendKeys("Vivo Y200");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button'] [@type='submit']")).click();

        //xpath with and operator means both value should be true

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.']")).sendKeys("Motorola edge 50");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button'] [@type='submit']")).click();


        //xpath with or operatpr means atleast one value should be true /match
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @placeholder='Search Amazon.']")).sendKeys("Samsung s23fe"); // both value true so write in search box
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='subit']")).click(); //not click both value not true

        //xpath with inner text , text() method used
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//a[text()='Home & Kitchen']")).click();

         //just inner text but not link,
        boolean displaystatus= driver.findElement(By.xpath("//h2[text()='Starting ₹149 | Headphones']")).isDisplayed();
        System.out.println(displaystatus);

       String value = driver.findElement(By.xpath("//h2[text()='Starting ₹149 | Headphones']")).getText();
        System.out.println(value);

         //xpath with contains () method-> Just provide attribute and half text of that like below Search Amazon.in i provide only Ama
        driver.findElement(By.xpath("//input[contains(@placeholder,'Ama')]")).sendKeys("Hello");

         //xpatch with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Goto hell");

       //  xpath with chained xpath that parent - to child and child to parents

    }
}
