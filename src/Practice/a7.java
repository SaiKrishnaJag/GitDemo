package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement table =driver.findElement(By.cssSelector("table[name='courses']"));
		List<WebElement> row = table.findElements(By.xpath("tbody/tr"));
		System.out.println(row.size());
		System.out.println(table.findElements(By.xpath("tbody/tr/th")).size());
		for (WebElement h : row.get(2).findElements(By.tagName("td")) )
		{
		System.out.println(h.getText());
	}
	}
}
