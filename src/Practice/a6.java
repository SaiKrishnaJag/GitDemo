package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("http://qaclickacademy.com/practice.php");
	      driver.manage().window().maximize();

	        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

	        String selection=driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();

	        Select s=new Select(driver.findElement(By.id("dropdown-class-example")));

	        s.selectByVisibleText(selection);

	        driver.findElement(By.name("enter-name")).sendKeys(selection);

	        driver.findElement(By.id("alertbtn")).click();

	     String alertText=  driver.switchTo().alert().getText();

	     if(alertText.contains(selection))

	     {

	    System.out.println("Alert message successful");

	     }

	     else

	    System.out.println("Failed");

	}
	   
	}

