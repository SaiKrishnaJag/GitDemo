package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input#autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("uni").build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//ul/li/div[contains(text(),'United Kingdom (UK)')]"))).click().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//ul/li/div[contains(text(),'United Kingdom (UK)')]"))).contextClick().build().perform();
		
	}

}
