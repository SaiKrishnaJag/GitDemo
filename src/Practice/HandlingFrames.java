package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("http://the-internet.herokuapp.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.partialLinkText("Nested")).click();
	      driver.switchTo().frame("frame-top");
          driver.switchTo().frame("frame-middle");
	      System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	}

}
