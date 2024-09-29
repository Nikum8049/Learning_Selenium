package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sdet_002_CssSelector2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        //tagname#idname   #idname only
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mobile"); //with tagname
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Mobile"); //without tagname
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // driver.findElement((By.cssSelector("#nav-search-submit-text"))).click();

        //Tagname.classname  .classname only
        driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("Mobile"); //withtag name
        driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute")).sendKeys("Mobile"); //without tagname

        //tagname[attributename='value'],   [attributename='value']
        //driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Laptop"); //with tagname
        //driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("Laptop"); //without tagnam

        //tagname.classname[attributename='value']  tagname.classname[attribute='value']
        driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("Pendriver");


    }
}
