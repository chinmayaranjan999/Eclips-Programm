package chinmaya123.chinmaya123;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownMultiple {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // its new available in selenium 4
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		WebElement NoofCountry = driver.findElement(By.xpath("//select[@name='Country']"));
		selectOptionFromDropDown(NoofCountry,"India");
	
		WebElement NoofEmployee = driver.findElement(By.xpath("//select[@name='NoOfEmployees']"));
		selectOptionFromDropDown(NoofEmployee,"16 - 20");
	}
	public static void selectOptionFromDropDown(WebElement ele, String value) {
		
		Select drp = new Select(ele);
		List<WebElement>alloptions = drp.getOptions();
		
		for(WebElement options : alloptions )
		{
			if(options.getText().equals(value))
			{
				options.click();
				break;
			}
			
			
		}
		
		
	}

	

}
