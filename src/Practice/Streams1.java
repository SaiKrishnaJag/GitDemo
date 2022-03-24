package Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Streams1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
driver.findElement(By.cssSelector("span.sort-icon.sort-descending")).click();
List<WebElement> li=driver.findElements(By.xpath("//tr/td[1]"));
List<String> orli=li.stream().map(s->s.getText()).collect(Collectors.toList());
List<String> sortedli=orli.stream().sorted().collect(Collectors.toList());
Assert.assertTrue(orli.equals(sortedli));



	}

}
