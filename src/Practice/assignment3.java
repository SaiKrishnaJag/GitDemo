package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	      driver.manage().window().maximize();
	      driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
	      driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
	      driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(6000));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
	      driver.findElement(By.cssSelector("button#okayBtn")).click();
	      Select a = new Select(driver.findElement(By.cssSelector("select.form-control")));
	      a.selectByVisibleText("Consultant");
	      driver.findElement(By.cssSelector("input#terms")).click();
	      driver.findElement(By.cssSelector("input#signInBtn")).click();
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn")));
	      List<WebElement> products= driver.findElements(By.cssSelector("button.btn"));
	      for(WebElement h: products)
	      {
	    	  h.click();
	      }
	      driver.findElement(By.partialLinkText("Checkout")).click();
	      
	      
	}

}
