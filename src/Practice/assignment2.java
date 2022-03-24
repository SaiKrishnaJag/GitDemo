package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://rahulshettyacademy.com/angularpractice/");
      driver.manage().window().maximize();
      
      
      driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='name']")).sendKeys("cris");
      driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @name='email']")).sendKeys("abc@abc.com");
      driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("hello123");
      driver.findElement(By.cssSelector("input#exampleCheck1")).click();
      Select gender= new Select(driver.findElement(By.cssSelector("select#exampleFormControlSelect1")));
      gender.selectByVisibleText("Female");
      driver.findElement(By.cssSelector("input#inlineRadio1")).click();
      driver.findElement(By.name("bday")).sendKeys("03/02/2022");
      driver.findElement(By.cssSelector("input.btn")).click();
      System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText()); 
     
      
	}

}
