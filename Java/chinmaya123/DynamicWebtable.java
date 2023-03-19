package chinmaya123.chinmaya123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		//WebElement ele = driver.findElement(By.xpath("//table[@id='customers']"));
		
	List<WebElement> ele = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		System.out.println(ele.size());
		
		for(WebElement Alldata : ele)
		{
			String value = Alldata.getText();
			System.out.println(value);
		}
		
		driver.quit();
		
		
		
	}

}
