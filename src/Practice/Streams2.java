package Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> li=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> priceli=li.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
		priceli.forEach(s->System.out.println(s));
	}

	public static String getPrice(WebElement s)
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
