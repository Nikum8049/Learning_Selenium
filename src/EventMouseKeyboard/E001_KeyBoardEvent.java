package EventMouseKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E001_KeyBoardEvent {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));

        Actions builder = new Actions(driver);


        builder.click(search)
                .keyDown(Keys.SHIFT)
                .sendKeys("Tops technologies")
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();


    }
}
