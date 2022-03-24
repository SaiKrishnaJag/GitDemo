package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("http://the-internet.herokuapp.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.partialLinkText("Multiple")).click();
	      driver.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
	      Set<String> s=driver.getWindowHandles();
	      Iterator<String> it=s.iterator();
	      String pw=it.next();
	      String cw=it.next();
	      driver.switchTo().window(cw);
	      System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
          driver.switchTo().window(pw);
	      System.out.println(driver.findElement(By.tagName("h3")).getText());
	      
	}

}
