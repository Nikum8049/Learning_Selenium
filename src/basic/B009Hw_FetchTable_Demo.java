package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class B009Hw_FetchTable_Demo {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        WebElement element = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/thead"));
//        System.out.println(element.getText());

       // List<WebElement> elements =driver.findElements(By.xpath("//table[@class="tsc_table_s13"]/thead"));

        WebElement element =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]"));
		System.out.println(element.getText());

		List<WebElement> elements1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		for(WebElement ele  :elements1)
        {
			System.out.println(ele.getText());
		}

		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

		for(WebElement ele  :elements)
		{
			System.out.println(ele.getText());
		}

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for(int i=2;i<=rows.size();i++)
        {
            List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
            for(WebElement col  :cols)
            {
                System.out.print(col.getText()+" ");
            }
            System.out.println();
        }
    }
}
