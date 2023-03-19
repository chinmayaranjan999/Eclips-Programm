package chinmaya123.chinmaya123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
	WebElement element=	driver.findElement(By.xpath("//select[@name='Country']"));
	Select sel = new Select(element);
	
	List<WebElement> Alloptions = sel.getOptions();
	for(WebElement options : Alloptions)
	{
		if(options.getText().equals("India"))
		{
			options.click();
			break;
		}
	}
		
		
		
	}

}
